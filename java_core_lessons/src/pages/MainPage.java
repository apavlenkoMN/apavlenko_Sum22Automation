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

    public DOMPage goToDOMPage(){
        driver.findElement(By.linkText("Challenging DOM")).click();
        return new DOMPage(driver);
    }

    public HoversPage goToHoversPage(){
        driver.findElement(By.linkText("Hovers")).click();
        return new HoversPage(driver);
    }




   // https://the-internet.herokuapp.com/


}
