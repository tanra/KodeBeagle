# KodeBeagle chrome extension
This is a chrome browser extension, which helps you to search code snippets from various open source repositories.
## Table of contents
* Installation
    *  From Github Releases
    *  From Chrome Store
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
2. Open the chrome browser and type in - _**chrome://extensions**_. Drag and drop the .crx file on this page after a message to _**Drop to install**_,  is displayed.
![Chrome Ext](http://chrome-extension-downloader.com/images/chrome-extensions-drop.png)

#### From Chrome store
- After the extension is available in the chrome extensions factory for public use you can install it from the factory directly.

## Using the chrome extension
Once the extension has been installed, you can use it.

1. Select a collection of code phrases or a word on the browser window and right-click, you can see a context menu select _**"Search this selection on KodeBeagle"**_.
![](https://lh3.googleusercontent.com/V89SJiQtpaTXQWyJ9Rm_agHNdFkazzcotnuXRPUdkWXPFaW3-42a9CiTVubekaxPmsEDewLyzHqkKeDzoNn0GyZ7YM0HM1wlZdubKMUYmgGxZ2JIXVXjhpAQ57Lz-gSrxnE8Xo6UxCRzKnodC6BZ3wdu7AGDyIBRKcGEqrJCTc-tMYV2AH6poxDMerDbJ5wToB4nESKozzYduiSh9xKIMaezxG2gTK1RAFgGj_pjnyqZhqmGTVrfhQbko6QxWkF6_D4Ezqie-bFo47bqqkhnbYA6B9BD8SxQmaItO06buIQOmXP_Jh7oPF6Ox-v2K2vUF2VZHKfBKdEjSfHcafcbjIePUmAVIHNGsXjcOZtMhv5MpWgmqKK71-eljUioCrTt1IJgKtQjqMSZrx9ybSN_5QVfx5f5teX2MF597LdTnmCxekeduG2sfRdTn05-nIRu99irrw3LJCRw-g2_TTbk8dCSGmIrrAIh7M6DfU0eaM_tbZeiWCgQ632y-TkhChz7_0E3YQPYdo6PMuNfNZavv8CGvvhqdQmB8HUCBplR13s=w1212-h681-no)
2. A new tab with the list of the code snippets for the selection from various repositories is displayed.
![](https://lh3.googleusercontent.com/4X1FU__N4IXffIn6SH1eOxtdpc-HxdipeisWmeknfm0jpIBH0tefnmYVVS6A3K6KGj6KAoxpYNkpBKd4dJocqy3mmak05mLHUIlxB7iZ598iPTpi6kst-bavYfWTbl9-KtFI-n3adytOP0R1Ofko5iRKHfxVLBhktPAqboApkq2bsmUpm8b2zs12MkmiF_adgGbWX6wYLWXQwMyCMsVh9O5GiqVZqhYEULdnVxA5YKczr8JpyWKkJU2AjCwsRbg08sgrzmB1Vw4r-tgiftSKt-vSeYMZ4G_673Na9jgEBC-LWvRYzFH7_Dxq0jWZVOOGAKekgHONCK26-MRUBlZx86K910_gktnNy67LzaKKToqRhZ6HkbzK02qoXhGQCAA5SVVTfZnnzuhn2yXiekzR6DgfH29cc_0MXlGrzpsZWMaugipj8JKYngYHIptVzYlM3igPnFECRXH6guWKORy-z6OnVEv23ZlqBfPMtnmTJy3BuiZ01ZM-wbXfZ9Dy5inLzOohaELLCbdTheurbpFsGc0lG8fgzl5DRockuvmRO_c=w1212-h681-no)

## Developer notes
### Requirements
* [NodeJS & NPM](http://nodejs.org/download)
* _gulp_ node package
* chrome browser

### Loading unpacked extension.
1. Open the chrome browser and type in - _**chrome://extensions**_.
2. Ensure that the _"Developer mode"_ checkbox in the top right-hand corner is selected.
3. Click _'Load unpacked extension'_ and choose the _src_ folder from the repo. 
![](https://lh3.googleusercontent.com/gq2oEklOjp4d_CuC-5v8x1uIMeRPu0OPtC5lO2Ci3LjtaMf5YHAyuCILdNVWW0__44r0TawYJpdAZgBwSeuxB3gHUSagI_GeqNWuNFjOILRETJtqTYwm-W-wZ3-dwvkZAL-I8leVP9Fs-yh1BJl3c7u3jr3F8yiL2WNa-oHe1W1RVGcpAvjjCLlyNlCAKLxlI58eZ35cwJ0dOQyVyNA5WhHeRFxdef-cVNT46dpGeEQwl7i9maIuZbmVkKhGSqkZcAmBbUtPOqZ-Rkz3lqT1i36KUhP0tajNCcTie6QKxPe0HcN6qXkxkB3fLqkIJqS4OgTr-UOqQ8emxUjzMQg4IlID8Dz6hQffXDWLMaLEUR__cbxaVXiMPTgd4pBKG2B47RfymA9O8MGSWlY12c3UiVyxv13m8FifWH1T9g1gr4bZbxKChqOYT_QchIk_KoSj5FQfUpQhpsDrWRTlRD_pXT9OPcq_98dP4nk4QsJTW-UmVNWZ7dYkF-AnNw0C1P3bcakAx6Lfbtktjf-lRGknrgWHYtrYo3yr2CESdgh7HR0=w988-h455-no)
4. Open the _**backgroundpage**_ from the chrome extensions page and setup the breakpoints to debug the extension code.  

### Packaging extension.
> This section is required only in these scenarios:             
> #1 - If the crx file is not available on the Github   
> #2 - If you like to update the extension    
> #3 - If you upload the extension to the chrome web store  
> **Note:** For scenarios #2 and #3 we will be using the same pem file.

Once the extension code gets stable, its time to create the .crx file which can be published to chrome extension factory for public use. 
Note that the chrome extensions are packaged as signed zip files with the file extension as _"crx"_.

**Note:** We package our own extension to distribute a non-public version.
1. Get the _.pem_ file from **_project leads_** and copy it to the root directory of the extension and do not change the .pem file name.
2. Open the terminal and execute _**sudo npm install**_ command which would download all the required node module dependencies mentioned in _package.json_.
3. Run the gulp task using the following command - _**gulp create:crx**_. This command creates a .crx file under build directory .
4. Open the chrome browser and type in - _**chrome://extensions**_. Drag and drop the .crx file on this page after a message to _**Drop to install**_,  is displayed.
![Chrome Ext](http://chrome-extension-downloader.com/images/chrome-extensions-drop.png)

### Updating an extension
To create an updated version of your extension:

1. Increase the version number in manifest.json.
2. Follow the steps from _Packaging extension_.

### Publishing an extension
**_Note:_** A one-time developer registration fee of US$5.00 is required to verify your account and publish items.

1. [Click here](https://chrome.google.com/webstore/developer/dashboard) to publish chrome extension.
2. Follow the steps in the following YouTube video.

[![Image](http://img.youtube.com/vi/Gn_jlvkHTnM/0.jpg)](https://www.youtube.com/watch?v=Gn_jlvkHTnM)
