package com.provectus.tests;

//
//public class SelenideTest extends DownloadFileSelenide {
//
//    String theFileName = "";
//
//    @Test(timeOut = 10)
//    public void selenideTest() throws IOException {
//        Configuration.browser = "chrome";
//        //Configuration.baseUrl = "https://the-internet.herokuapp.com/download";
//
//        DownloadFilePageSelenide downloadPage = open();
//        downloadPage.downloadTXTFile();
//
//        Assert.assertEquals(downloadPage.getPageTitle(), "File Downloader", "compare title");
//
//        String fileName = downloadPage.getFileName();
//        theFileName = fileName;
//        downloadPage.downloadTXTFile();
//
//        FileWriter file = new FileWriter("/Users/apavlenko/Git/apavlenko_provectus_Sum22Automation_course/src/test/resources/testing/"+fileName, true);
//
//        file.write("adding new text from the test2");
//        file.write("\n");
//
//        file.close();
//
//        Assert.assertEquals(downloadPage.getPageTitle(), "File Downloader", "compare title");
//
//
//    }
//}
