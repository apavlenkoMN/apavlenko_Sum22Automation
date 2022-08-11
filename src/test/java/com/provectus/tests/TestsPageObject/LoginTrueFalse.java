package com.provectus.tests.TestsPageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SecurePage;

public class LoginTrueFalse extends BaseTest {


    @Test(description = "login should pass", priority = 10)
    public void LoginTestPass(){

        SecurePage securePage = openApp().goToAuthPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();
        String alert = securePage.getAlertText();
        Assert.assertTrue(alert.contains("You logged into a secure area!"), "user should be logged in");

        securePage.logout();


    }

    @Test (description = "login should fail", priority = 20)
    public void LoginTestFail() throws InterruptedException{
        SecurePage securePage = openApp().goToAuthPage()
                .setUsername("tomsmith2")
                .setPassword("SuperSecretPassword!2")
                .clickLogin();
        String alert = securePage.getAlertText();
        Assert.assertTrue(alert.contains("Your username is invalid!"), "user should not be logged in");

    }


}
