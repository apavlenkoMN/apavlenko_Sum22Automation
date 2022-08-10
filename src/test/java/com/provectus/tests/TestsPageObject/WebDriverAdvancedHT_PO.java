package com.provectus.tests.TestsPageObject;

import com.provectus.tests.TestsPageObject.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DOMPage;
import pages.HoversPage;
import pages.MainPage;

import java.time.Duration;
import java.util.List;

public class WebDriverAdvancedHT_PO extends BaseTest {




    // https://crossbrowsertesting.github.io/drag-and-drop.html - написать тест,
    // который будет перетаскивать элементы и проверять результат (Dropped!)



//
//    @Test(description = "dragAndDrop", priority = 10)
//    public void DragAndDrop() throws InterruptedException {
//
//
//        MainPage mainPage = new MainPage(driver);
//        mainPage.goToDOMPage();
//
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
//
//        WebElement dragbleElement =  driver.findElement(By.id("draggable"));
//        WebElement droppableElement =  driver.findElement(By.id("droppable"));
//
//
//        Assert.assertTrue(droppableElement.getText().contains("Drop here"));
//        Actions actions = new Actions(driver);
//
//        actions.dragAndDrop(dragbleElement,droppableElement).build().perform();
//
//        //OR
//        actions.moveToElement(dragbleElement).clickAndHold()
//                .moveToElement(droppableElement).release()
//                .build().perform();
//
//
//        Assert.assertTrue(droppableElement.getText().contains("Dropped!"));
//
//        driver.quit();
//    }
//
//
//
//    // https://crossbrowsertesting.github.io/hover-menu.html - написать тест,
//    // который раскрывает dropdown-меню, кликает на пункт Secondary Action и проверяет,
//    // что текст "Secondary Page" отобразился на странице
//
//    @Test (description = "dropdown and secondary action", priority = 20)
//    public void Dropdown() throws InterruptedException{
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
//
//        //WebElement dropdownAction = driver.findElement(By.cssSelector("#dropdown-toggle"));
//
//
//        Assert.assertTrue(driver.findElement( By.xpath("//h1[text()='Home Page']")).isDisplayed());
//        Assert.assertTrue(driver.findElement( By.xpath("//h1[text()='Home Page']/../p")).getText()
//                .contains("Welcome. This is a test page for menu hovers with selenium test."));
//
//        WebElement dropdownAction = driver.findElement(By.xpath("//*[@class='dropdown-toggle']"));
//        WebElement secondaryMenu = driver.findElement(By.xpath("//li[@class='dropdown']/ul/li[@class='secondary-dropdown']"));
//        WebElement secondaryAction = driver.findElement(By.xpath("//li[@class='dropdown']/ul/li/ul/li/a"));
//
//
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(dropdownAction).moveToElement(secondaryMenu).moveToElement(secondaryAction).click().build().perform();
//        //actions.moveToElement(secondaryMenu).click();
//
//        Assert.assertTrue(driver.findElement( By.xpath("//h1[text()='Secondary Page']")).isDisplayed());
//        Assert.assertTrue(driver.findElement( By.xpath("//h1[text()='Secondary Page']/../p")).getText()
//                .contains("Secondary action in the menu was clicked successfully!"));
//
//
//        driver.quit();
//    }


    //https://the-internet.herokuapp.com/hovers - написать тест,
    // который выводит юзернейм каждого пользователя (для этого нужно навести мышку на аватар)
//
//    @Test (description = "hover and usernames", priority = 30)
//    public void Hover() throws InterruptedException{
//
//        MainPage mainPage = new MainPage(driver);
//        mainPage.goToHoversPage();
//
//
//        HoversPage hoversPage = new HoversPage(driver);
//
//        hoversPage.checkAllUsers();
//
//    }


    @Test (description = "hover and usernames 2nd way", priority = 40)
    public void hoversTest2() {



        MainPage mainPage = new MainPage(driver);
        mainPage.goToHoversPage();


        HoversPage hoversPage = new HoversPage(driver);

         // hoversPage.titleIsDisplayed();
        hoversPage.hoverToUser1AndStore();
        Assert.assertTrue(hoversPage.getUser1().isDisplayed());
//
//        hoversPage.hoverToUser2AndStore();
//        Assert.assertTrue(hoversPage.getUser2().isDisplayed());
//
//        hoversPage.hoverToUser3AndStore();
//        Assert.assertTrue(hoversPage.getUser3().isDisplayed());
//


//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//
//        driver.get("https://the-internet.herokuapp.com/hovers");
//
//        Assert.assertTrue(driver.findElement(By.xpath("//h3[text()='Hovers']")).isDisplayed());
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user1']")).isDisplayed());
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.cssSelector(".figure"))).build().perform();
//        // //div[contains(@class, 'figure')]
//        Assert.assertTrue(driver.findElement(By.xpath("//h5[text()='name: user1']")).isDisplayed());
//
//        //move to 2nd
//        //div[2][contains(@class, 'figure')]
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user2']")).isDisplayed());
//        actions.moveToElement(driver.findElement(By.xpath("//div[2][contains(@class, 'figure')]")))
//        .build().perform();
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user1']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//h5[text()='name: user2']")).isDisplayed());
//
//
//        //move to 3rd
//        //div[2][contains(@class, 'figure')]
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user3']")).isDisplayed());
//        actions.moveToElement(driver.findElement(By.xpath("//div[3][contains(@class, 'figure')]")))
//        .build().perform();
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user1']")).isDisplayed());
//        Assert.assertFalse(driver.findElement(By.xpath("//h5[text()='name: user2']")).isDisplayed());
//        Assert.assertTrue(driver.findElement(By.xpath("//h5[text()='name: user3']")).isDisplayed());
//
//        driver.quit();

    }

}
