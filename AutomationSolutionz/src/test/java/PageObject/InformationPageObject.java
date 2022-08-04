package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InformationPageObject extends PageObject{

    @FindBy(xpath = "//*[@id=\"hint-toggle\"]")
    public WebElement hintButton;

    @FindBy(xpath = "//*[@id=\"verify_id\"]")
    public WebElement verifyButton;


    public InformationPageObject(WebDriver driver){
        super(driver);
    }
}

