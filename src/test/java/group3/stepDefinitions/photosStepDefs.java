package group3.stepDefinitions;

import group3.pages.LoginPage;
import group3.pages.PhotosPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class photosStepDefs {

    LoginPage loginPage = new LoginPage();
    PhotosPage photosPage = new PhotosPage();


    @When("user click the photos icon")
    public void user_click_the_photos_icon() throws InterruptedException {
        loginPage.photosImgBar.click();
        Thread.sleep(3000);
    }
    @When("Your photos should be selected")
    public void your_photos_should_be_selected() {
        photosPage.yourPhotosIcon.isSelected();
        photosPage.yourPhotosIcon.click();
    }
    @Then("user should see MarchImg and AugustImg")
    public void user_should_see_march_img_and_august_img() {
        Assert.assertTrue(photosPage.marchImg.isDisplayed());
        Assert.assertTrue(photosPage.augustImg.isDisplayed());
    }



}
