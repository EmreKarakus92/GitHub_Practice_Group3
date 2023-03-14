package group3.pages;

import group3.utilities.ConfigurationReader;
import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy (xpath = " //input[@id='user']")
    public WebElement usernameInputBox;

    @FindBy (xpath = " //input[@id='password']")
    public  WebElement passwordInputBox;

    @FindBy (xpath = " //input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement invalidCredentialsErrorMessage;

    public  void loginFunction(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }





}
