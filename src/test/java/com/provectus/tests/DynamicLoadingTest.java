package com.provectus.tests;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.selenidePages.DynamicLoadingPage;

public class DynamicLoadingTest {


    @Test(description = "dynamic load, link1", priority = 10)
    public void DynamicLoadingTest1() throws InterruptedException {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";


        //Selenide.open("https://the-internet.herokuapp.com/dynamic_loading");

            DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
            dynamicLoadingPage.open();

            Assert.assertEquals(dynamicLoadingPage.getPageTitle(), "Dynamically Loaded Page Elements", "compare title");

            dynamicLoadingPage.openLink1();
            dynamicLoadingPage.getStart().shouldBe(Condition.visible).shouldHave(Condition.text("Start"));
            Assert.assertEquals(dynamicLoadingPage.getExampleText(), "Example 1: Element on page that is hidden", "compare example");

            dynamicLoadingPage.startAndCheck();
        Assert.assertEquals(dynamicLoadingPage.getFinishText(), "Hello World!", "compare final result");

        System.out.println(dynamicLoadingPage.getFinishText());

    }
    @Test(description = "dynamic load, link2", priority = 20)
    public void DynamicLoadingTest2() throws InterruptedException {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";


       // Selenide.open("https://the-internet.herokuapp.com/dynamic_loading");

        DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
        dynamicLoadingPage.open();

        Assert.assertEquals(dynamicLoadingPage.getPageTitle(), "Dynamically Loaded Page Elements", "compare title");

        dynamicLoadingPage.openLink2();
        dynamicLoadingPage.getStart().shouldBe(Condition.visible).shouldHave(Condition.text("Start"));
        Assert.assertEquals(dynamicLoadingPage.getExampleText(), "Example 2: Element rendered after the fact", "compare example");

        dynamicLoadingPage.startAndCheck();
        Assert.assertEquals(dynamicLoadingPage.getFinishText(), "Hello World!", "compare final result");

        System.out.println(dynamicLoadingPage.getFinishText());

    }

}
