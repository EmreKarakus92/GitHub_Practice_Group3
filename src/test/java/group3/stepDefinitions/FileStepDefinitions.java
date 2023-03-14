package group3.stepDefinitions;

import group3.pages.FilePage;
import group3.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileStepDefinitions {
    FilePage filePage=new FilePage();

    @When("user should be able to click file image")
    public void user_should_be_able_to_click_file_image() {
        filePage.filesimage.click();


    }
    @Then("user should see uploaded files")
    public void user_should_see_uploaded_files() {
        Assert.assertTrue(filePage.filesTable.isEnabled());
        System.out.println("user should see uploaded files");
        filePage.filesTable.click();
        filePage.userProfile.click();
        filePage.logOut.click();
    }
  /*  @When("user should be able to click plus button")
    public void user_should_be_able_to_click_plus_button() {
        filePage.uploadplusbutton.click();
    }
    @When("user should be able to click file new folder option and write folder name")
    public void user_should_be_able_to_click_file_new_folder_option_and_write_folder_name()  {
        filePage.newFolderButton.click();
        filePage.folderNameBox.sendKeys("cydeo practise5");
      //  BrowserUtils.sleep(3);
    }



    @When("user should be click upload button or enter keyse")
    public void user_should_be_click_upload_button_or_enter_keyse()  {
        filePage.commitButton.click();
    }
    @Then("user should be see folder that is uploaded on the filestable")
    public void user_should_be_see_folder_that_is_uploaded_on_the_filestable()  {
Assert.assertEquals("cydeo practise5",filePage.folderUploaded.getText());

    }*/

}







