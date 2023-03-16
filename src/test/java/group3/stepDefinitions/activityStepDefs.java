package group3.stepDefinitions;
import group3.pages.ActivityPage;
import group3.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activityStepDefs {
    ActivityPage activityPage = new ActivityPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User click on the {string}")
    public void user_click_on_the(String activityLink) {
        String titleOfDashboard = "Dashboard - Seamlessly";
        wait.until(ExpectedConditions.titleIs(titleOfDashboard));

        activityPage.activityLink.click();

    }


    @Then("User see URL contains {string}")
    public void userSeeURLContains(String expectedUrlContained) {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrlContained));
    }

    @Then("User see title equals {string}")
    public void user_see_title_equals(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

}
