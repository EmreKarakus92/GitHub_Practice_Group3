package group3.pages;

import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{

//    public ContactsPage(){
//        PageFactory.initElements(Driver.getDriver(),this);
//    }

    @FindBy(xpath = "((//a[@href='/index.php/apps/contacts/'])[1])")
    public WebElement ContactsImage;

    @FindBy(xpath = "//a[@aria-current='page']")
    public WebElement linkAllContacts;


}
