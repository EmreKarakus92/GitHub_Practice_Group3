package group3.stepDefinitions;

import group3.pages.CalenderPage;
import group3.pages.ContactsPage;
import group3.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Calender_StepDefs {

    LoginPage loginPage = new LoginPage();
    CalenderPage calenderPage = new CalenderPage();

    @When("user sees the calender button")
    public void user_sees_the_calender_button() {
        Assert.assertTrue(calenderPage.calenderIcon.isDisplayed());

    }

    @When("User click calender button")
    public void user_click_calender_button() {
        calenderPage.calenderIcon.click();
    }

    @Then("User see calender opening")
    public void user_see_calender_opening() {

    }



}
