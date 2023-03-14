package group3.pages;
import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {


    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//img[contains(@src, 'php')]")
    public WebElement UsernameButton;
    @FindBy(xpath = "//a[contains(@href, 'j')]")
    public WebElement LogOutButton;



}