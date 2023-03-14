package group3.stepDefinitions;

import group3.pages.BasePage;
import group3.pages.NotesPage;
import group3.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotesStepDefs {

    BasePage basePage = new BasePage();
    NotesPage notesPage = new NotesPage();


    @When("user clicks notes image")
    public void user_clicks_notes_image() {
        basePage.notesImgBar.click();
    }

    @Then("user should see notes page")
    public void user_should_see_notes_page() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Notes"));

    }
}
