package group3.stepDefinitions;

import group3.pages.UsernamePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserNameStepDefs {

    UsernamePage usernamePage = new UsernamePage();

    @Then("Verify user sees own profile name")
    public void verify_user_sees_own_profile_name() {
        usernamePage.profile.click();
        String actualProfileName = usernamePage.profileName.getText();

        Assert.assertTrue(actualProfileName.equals("Adam"));
    }








}
