package group3.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotosPage extends BasePage{

    //@FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-yourphotos']")
    //*[@id="app-navigation-vue"]/ul/li[1]/a/span
    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[1]/a/span")
    public WebElement yourPhotosIcon;

    @FindBy(xpath = "//p[@id='image-20751']")
    public WebElement marchImg;

    @FindBy(xpath = "//p[@id='image-10526']")
    public WebElement augustImg;
}
