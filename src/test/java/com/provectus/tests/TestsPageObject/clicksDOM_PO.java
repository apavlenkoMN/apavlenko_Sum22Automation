package com.provectus.tests.TestsPageObject;

import com.provectus.tests.TestsPageObject.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pages.DOMPage;
import pages.MainPage;
import pages.SecurePage;

import java.util.List;

public class clicksDOM_PO extends BaseTest {


//    https://the-internet.herokuapp.com/challenging_dom - нужно кликнуть на каждую кнопку.
//    после этого нужно выбрать все значения из 4й колонки и вывести на экран



    @Test(description = "clicks and values")
    public void clickButtons() throws InterruptedException {



        MainPage mainPage = new MainPage(driver);
        mainPage.goToDOMPage();


        DOMPage domPage = new DOMPage(driver);

        domPage.clickOnButtonsInOrder();


            // method with any column
        domPage.findElementsInColumnN(4);


    }








}
