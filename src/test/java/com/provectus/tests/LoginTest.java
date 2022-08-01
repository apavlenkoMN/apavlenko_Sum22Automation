package com.provectus.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{

    @BeforeTest
    public void before() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }



    @DataProvider(name = "userProvider")
    public Object[][] userProvider(){
        Object[][] result = {
                {"user1", "pass1"},
//                {"user2", "pass2"},
                {"tomsmith", "pass3"}
        };
        return result;
    }

    private static WebDriver driver;

    @Test(groups = {"Group1"}, dataProvider = "userProvider")
    public void LoginTest1(String user, String passw) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(user);


        if (user == "tomsmith") {
            WebElement pass = driver.findElement(By.id("password"));
            pass.sendKeys("SuperSecretPassword!");
        } else {
            WebElement pass = driver.findElement(By.id("password"));
//        pass.sendKeys("SuperSecretPassword!2");
            pass.sendKeys(passw);
        }

        WebElement submit = driver.findElement(By.cssSelector("button.radius"));
        submit.click();

        WebElement header = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(header.getText(), "Secure Area");

        // Assert.assertEquals(getHeaderText(),"Secure Area");

        driver.quit();
    }
    @Test (groups = {"Group2"}, dependsOnGroups = {"Group1"}, description = "depends on test1")
    public void LoginTest2() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("SuperSecretPassword!");

        WebElement submit = driver.findElement(By.cssSelector("button.radius"));
        submit.click();

        WebElement header = driver.findElement(By.tagName("h2"));
        Assert.assertEquals(header.getText(),"Secure Area");

        // Assert.assertEquals(getHeaderText(),"Secure Area");

        driver.quit();
    }



    @Parameters({"name", "pass"})
    @Test (groups = {"Group2"})
    public void LoginTest3(String name, String password) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys(name);

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys(password);
        //pass.sendKeys(System.getProperty("pass"));

        WebElement submit = driver.findElement(By.cssSelector("button.radius"));
        submit.click();

        WebElement header = driver.findElement(By.tagName("h2"));

        Assert.assertEquals(header.getText(),"Login Page");

        driver.quit();
    }




}
