package group3.pages;

import group3.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
