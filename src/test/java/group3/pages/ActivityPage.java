package group3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityPage extends BasePage{

    @FindBy(xpath = "(//a[@href='/index.php/apps/activity/'])[1]")
    public WebElement activityLink;
}





