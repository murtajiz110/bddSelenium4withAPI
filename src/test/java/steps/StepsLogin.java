package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testActions.MercuryToursHome_tests;
import utils.Swd;

import static utils.Constants.myLogger;
import static utils.Constants.startPage;
import static utils.Swd.myChromeDriver;

public class StepsLogin {

    private MercuryToursHome_tests mthTest = new MercuryToursHome_tests();

    @Given("^I navigate to mercurytours login page$")
    public void I_navigate_to_mercurytours_login_page(){
        Swd.getDriver();
        myChromeDriver.get(startPage);
        myLogger.info(" mercurytours home page opened ");

    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\" values$")
    public void I_enter_valid_username_and_password_values(String username, String password) {
        mthTest.enterCredentials(username, password);
        myLogger.info(" credentials entered");

    }

    @And("^I click sign in button$")
    public void I_click_sing_in_button(){
        mthTest.clickLoginButton();
        myLogger.info(" login button clicked");

    }

    @Then("^My landing page is shown$")
    public void My_landing_page_is_shown(){
        mthTest.verifyLandingPageIsShown();
        myLogger.info("landing page shown");
    }


    @Then("^I logout the application$")
    public void iLogoutTheApplication() {
        mthTest.logoutMercuryTours();
    }
}
