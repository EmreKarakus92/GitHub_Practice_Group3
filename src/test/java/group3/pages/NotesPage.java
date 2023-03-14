package group3.pages;

import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotesPage {

    public NotesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "notes_new_note")
    public WebElement newNote;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[5]/a/span")
    public WebElement newNoteOnLeftSide;

    @FindBy(xpath = "//button[@class='icon vue-button action-item__menutoggle action-item__menutoggle--default-icon']")
    public WebElement renamePathButton;

    @FindBy(xpath = "//button[@class='action-button focusable']")
    public WebElement renameButton;

    @FindBy(xpath = "//input[@class='app-navigation-input-confirm__input']")
    public WebElement renameTextArea;


}
