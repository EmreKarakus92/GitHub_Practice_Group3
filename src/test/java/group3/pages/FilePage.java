package group3.pages;

import group3.utilities.BrowserUtils;
import group3.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilePage extends BasePage {
    //public FilePage(){
    //   PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(id = "user")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(id="submit-form")
    public WebElement loginButtonBox;
    @FindBy(xpath = "//ul[@id='appmenu']/li[2] ")  ///a[@href='/index.php/apps/files/'
    public WebElement filesimage;
    //@FindBy(id = "filestable")
    @FindBy(xpath = "//label[@for='select_all_files']")

    public WebElement filesTable;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement uploadplusbutton;
    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderButton;
    @FindBy(xpath = "//input[@id='view11-input-folder']")
    public WebElement folderNameBox;
    String foldername="cydeo practiseE10";
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement commitButton;
    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement userProfile;
    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOut;


  /*  @FindBy(xpath = "(//span[@class='innernametext'])[3]")
    public WebElement folderUploaded;*/



    public void setNewFolder(){
        uploadplusbutton.click();
        newFolderButton.click();
        newFolderButton.sendKeys(foldername);
        //BrowserUtils.sleep(2);
        commitButton.click();


    }






}

