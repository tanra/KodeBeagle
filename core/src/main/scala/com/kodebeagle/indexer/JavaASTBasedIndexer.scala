/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kodebeagle.indexer

import com.kodebeagle.logging.Logger
import com.kodebeagle.parser.MethodVisitor

import scala.collection.immutable

class JavaASTBasedIndexer extends BasicIndexer with Logger {

  import JavaFileIndexerHelper._

  override def linesOfContext: Int = 0

  private def extractTokensASTParser(excludePackages: Set[String],
      fileContent: String, fileName: String): (Set[(String, String)], Set[Set[Token]]) = {
    val parser = new MethodVisitor()
    parser.parse(fileContent, fileName)
    import scala.collection.JavaConversions._

    val imports = parser.getImportDeclMap.toIterator.map { x =>
      (x._2.stripSuffix(s".${x._1}"), x._1)
    }.filterNot {
      case (left, right) => excludePackages.contains(left)
    }.toSet

    val importsSet = imports.map(tuple2ToImportString)
    (imports,
      parser.getListOflineNumbersMap.map { x =>
        x.map(y => Token(y._1, y._2.map(_.toInt).toSet))
          .filter(x => importsSet.contains(x.importName)).toSet
      }.toSet)
  }

  override def generateTokens(files: Map[String, String], excludePackages: List[String],
      repo: Option[Repository]): Set[IndexEntry] = {
    var indexEntries = immutable.HashSet[IndexEntry]()
    val r = repo.getOrElse(Repository.invalid)
    for (file <- files) {
      val (fileName, fileContent) = file
      val fullGithubURL = fileNameToURL(r, fileName)
      try {
        val (imports, tokens) = extractTokensASTParser(excludePackages.toSet, fileContent, fileName)
        val score =
          if (isTestFile(imports)) r.stargazersCount / penalizeTestFiles else r.stargazersCount
        tokens.foreach { y =>
          indexEntries = indexEntries + IndexEntry(r.id, fullGithubURL, y, score)
        }
      } catch {
        case e: Throwable => log.error(s"Failed for $fullGithubURL", e);
      }
    }
    indexEntries
  }
}
