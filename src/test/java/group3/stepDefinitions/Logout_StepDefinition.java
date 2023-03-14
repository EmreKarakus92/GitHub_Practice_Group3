package group3.stepDefinitions;

import group3.pages.LogOutPage;
import group3.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_StepDefinition {

    LogOutPage logOutPage = new LogOutPage();


    @When("User click A Button")
    public void user_click_a_button() {
        logOutPage.UsernameButton.click();
    }

    @When("User click logout Button")
    public void user_click_logout_button() {
        logOutPage.LogOutButton.click();
    }

    @Then("User see login Page")
    public void user_see_login_page() {

        String expectedURL = "https://qa.seamlessly.net/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));

    }
}