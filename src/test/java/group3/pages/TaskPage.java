package group3.pages;

import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

     public TaskPage(){
          PageFactory.initElements(Driver.getDriver(), this);
     }

    @FindBy (xpath = "//a[@aria-label='Tasks']")
    public WebElement Task;

    @FindBy(xpath = "//span[.='Homeworks']")
    public WebElement TaskList;






}
