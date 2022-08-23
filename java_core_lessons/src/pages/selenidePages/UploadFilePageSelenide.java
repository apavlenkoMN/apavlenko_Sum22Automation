package pages.selenidePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.SecurePage;

public class UploadFilePageSelenide extends BasePage {


    @FindBy(tagName = "h3")
    private WebElement pageTitle;

    @FindBy(id = "file-upload")
    private WebElement fileUploadLink;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;


    public UploadFilePageSelenide(WebDriver driver){

        super(driver);
        PageFactory.initElements(driver, this);
    }


    public String getPageTitle(){
        return pageTitle.getText();
    }

    public UploadFilePageSelenide selectFile(String path){
        fileUploadLink.sendKeys(path);
        return this;
    }

    public UploadFilePageSelenide clickUpload(){
        uploadButton.click();
        return this;
    }

    public SecurePage upload(String path){
        selectFile(path);
        clickUpload();
        return new SecurePage(driver);
    }



}
