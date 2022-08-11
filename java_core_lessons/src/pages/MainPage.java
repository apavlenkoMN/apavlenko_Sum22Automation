package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage{



    public MainPage(WebDriver driver){
        super(driver); //вызвать родительский конструктор

    }

    public LoginPage goToAuthPage(){
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(driver);
    }

    public LoginPage goToDOMPage(){
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new LoginPage(driver);
    }

    public LoginPage goToHoversPage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new LoginPage(driver);
    }




   // https://the-internet.herokuapp.com/


}
