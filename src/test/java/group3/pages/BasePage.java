package group3.pages;

import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@class='active'])[1]")
    public WebElement dashboardImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement photosImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement activityImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement contactsImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]/a")
    public WebElement calendarImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement notesImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]/a")
    public WebElement deckImgBar;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[9]/a")
    public WebElement tasksImgBar;

    @FindBy(xpath = "//*[@id=\"expand\"]/div/img")
    public WebElement viewProfileImg;









}
