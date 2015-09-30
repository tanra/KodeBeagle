# KodeBeagle chrome extension
This is a chrome browser extension, which helps users to search for code snippets from various open source repositories.
## Table of contents
* Installation steps
    *  From Github releases
    *  From chrome store
* Using the chrome extension
* Developer notes
    * Requirements.
    * Loading unpacked extension.
    * Packaging extension.
    * Updating extension.
    * Publishing extension.

## Installation steps
#### From Github releases
1. Download the .crx file from the Github release or follow the steps on _"Packaging extension"_ below.
2. Open the chrome browser and type in - _**chrome://extensions**_. Drag and drop the .crx file on this page and it will instruct with a message as _**Drop to install**_,  now drop the extension.
![Chrome Ext](http://chrome-extension-downloader.com/images/chrome-extensions-drop.png)

#### From Chrome store
- Soon the extension will be available in the chrome extensions factory for public use and once available we can install it from the factory directly.

## Using the chrome extension
Once the extension has been installed, it's time for us to make use of this extension.
1. Select either a collection of code phrases or a word on the browser windown and right click, upon doing this we should see a context menu saying _**"Search this selection on KodeBeagle"**_
![](https://lh3.googleusercontent.com/V89SJiQtpaTXQWyJ9Rm_agHNdFkazzcotnuXRPUdkWXPFaW3-42a9CiTVubekaxPmsEDewLyzHqkKeDzoNn0GyZ7YM0HM1wlZdubKMUYmgGxZ2JIXVXjhpAQ57Lz-gSrxnE8Xo6UxCRzKnodC6BZ3wdu7AGDyIBRKcGEqrJCTc-tMYV2AH6poxDMerDbJ5wToB4nESKozzYduiSh9xKIMaezxG2gTK1RAFgGj_pjnyqZhqmGTVrfhQbko6QxWkF6_D4Ezqie-bFo47bqqkhnbYA6B9BD8SxQmaItO06buIQOmXP_Jh7oPF6Ox-v2K2vUF2VZHKfBKdEjSfHcafcbjIePUmAVIHNGsXjcOZtMhv5MpWgmqKK71-eljUioCrTt1IJgKtQjqMSZrx9ybSN_5QVfx5f5teX2MF597LdTnmCxekeduG2sfRdTn05-nIRu99irrw3LJCRw-g2_TTbk8dCSGmIrrAIh7M6DfU0eaM_tbZeiWCgQ632y-TkhChz7_0E3YQPYdo6PMuNfNZavv8CGvvhqdQmB8HUCBplR13s=w1212-h681-no)
2. And a new tab opens up which lists out the code snippets for the selection from various repositories.
![](https://lh3.googleusercontent.com/4X1FU__N4IXffIn6SH1eOxtdpc-HxdipeisWmeknfm0jpIBH0tefnmYVVS6A3K6KGj6KAoxpYNkpBKd4dJocqy3mmak05mLHUIlxB7iZ598iPTpi6kst-bavYfWTbl9-KtFI-n3adytOP0R1Ofko5iRKHfxVLBhktPAqboApkq2bsmUpm8b2zs12MkmiF_adgGbWX6wYLWXQwMyCMsVh9O5GiqVZqhYEULdnVxA5YKczr8JpyWKkJU2AjCwsRbg08sgrzmB1Vw4r-tgiftSKt-vSeYMZ4G_673Na9jgEBC-LWvRYzFH7_Dxq0jWZVOOGAKekgHONCK26-MRUBlZx86K910_gktnNy67LzaKKToqRhZ6HkbzK02qoXhGQCAA5SVVTfZnnzuhn2yXiekzR6DgfH29cc_0MXlGrzpsZWMaugipj8JKYngYHIptVzYlM3igPnFECRXH6guWKORy-z6OnVEv23ZlqBfPMtnmTJy3BuiZ01ZM-wbXfZ9Dy5inLzOohaELLCbdTheurbpFsGc0lG8fgzl5DRockuvmRO_c=w1212-h681-no)

## Developer notes
### Requirements
* [NodeJS & NPM](http://nodejs.org/download)
* _gulp_ node package
* chrome browser

### Loading unpacked extension.
1. Open the chrome browser and type in - _**chrome://extensions**_.
2. Ensure that the _"Developer mode"_ checkbox in the top right-hand corner is checked.
3. Click on _'Load unpacked extension'_ and choose the _src_ folder from the repo. Once the folder is uploaded we should be seeing something similar to below snap.
![](https://lh3.googleusercontent.com/gq2oEklOjp4d_CuC-5v8x1uIMeRPu0OPtC5lO2Ci3LjtaMf5YHAyuCILdNVWW0__44r0TawYJpdAZgBwSeuxB3gHUSagI_GeqNWuNFjOILRETJtqTYwm-W-wZ3-dwvkZAL-I8leVP9Fs-yh1BJl3c7u3jr3F8yiL2WNa-oHe1W1RVGcpAvjjCLlyNlCAKLxlI58eZ35cwJ0dOQyVyNA5WhHeRFxdef-cVNT46dpGeEQwl7i9maIuZbmVkKhGSqkZcAmBbUtPOqZ-Rkz3lqT1i36KUhP0tajNCcTie6QKxPe0HcN6qXkxkB3fLqkIJqS4OgTr-UOqQ8emxUjzMQg4IlID8Dz6hQffXDWLMaLEUR__cbxaVXiMPTgd4pBKG2B47RfymA9O8MGSWlY12c3UiVyxv13m8FifWH1T9g1gr4bZbxKChqOYT_QchIk_KoSj5FQfUpQhpsDrWRTlRD_pXT9OPcq_98dP4nk4QsJTW-UmVNWZ7dYkF-AnNw0C1P3bcakAx6Lfbtktjf-lRGknrgWHYtrYo3yr2CESdgh7HR0=w988-h455-no)
4. We're now ready to debug the extension code, to do so, open the _**backgroundpage**_ from the chrome extensions page and setup the breakpoints.  

### Packaging extension.
> This section is relevant only for the following three reasons...              
> #1 - Either the crx file is not available on the Github,   
> #2 - Or we would like to update the extension,     
> #3 - Or upload the extension to the chrome web store  
> **Note:** For #2 and #3 we will be using the same pem file.

Once the extension code gets stable, its time to create the .crx file which can be published to chrome extension factory for public use. Please note that chrome extensions are packaged as signed zip files with the file extension as _"crx"_.
**Note:** We package our own extension to distribute a non-public version.
1. Get the _.pem_ file from **_project leads_** and copy it to the root directory of the extension and do not change the .pem file name.
2. Open the terminal and execute _**sudo npm install**_ command which would download all the required node module dependencies mentioned in _package.json_.
3. Now run the gulp task using the following command - _**gulp create:crx**_. This command creates a .crx file under build directory .
4. Open the chrome browser and type in - _**chrome://extensions**_. Drag and drop the .crx file on this page and it will instruct with a message as _**Drop to install**_, now drop the extension.
![Chrome Ext](http://chrome-extension-downloader.com/images/chrome-extensions-drop.png)

### Updating an extension
To create an updated version of your extension:
1. Increase the version number in manifest.json.
2. Follow the steps from _Packaging extension_

### Publishing an extension
**_Note:_** A one-time developer registration fee of US$5.00 is required to verify your account and publish items.

1. [Click here](https://chrome.google.com/webstore/developer/dashboard) to publish chrome extension.
2. Follow the steps in the below YouTube video.

[![Image](http://img.youtube.com/vi/Gn_jlvkHTnM/0.jpg)](https://www.youtube.com/watch?v=Gn_jlvkHTnM)
