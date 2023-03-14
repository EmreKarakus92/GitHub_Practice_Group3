package group3.pages;

import group3.utilities.ConfigurationReader;
import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsernamePage {


    public UsernamePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="expand")
    public WebElement profile;

    @FindBy(xpath = "//div[.='Adam']")
    public WebElement profileName;
}
