package testActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.MercuryToursHome;
import utils.Constants;
import utils.Swd;

public class MercuryToursHome_tests extends Swd {

    private MercuryToursHome mth = null;

    public MercuryToursHome_tests(){
        this.mth = new MercuryToursHome();
        PageFactory.initElements(myChromeDriver, mth);
    }

    public void enterCredentials (String uname, String pwd){
        waitForElement(mth.inputUserName);
        mth.inputUserName.sendKeys(uname);

        waitForElement(mth.inputPassword);
        mth.inputPassword.sendKeys(pwd);
    }

    public void clickLoginButton(){
        waitForElement(mth.btnLogin);
        mth.btnLogin.click();
    }

    public void verifyLandingPageIsShown(){

        Assert.assertTrue(myChromeDriver.getCurrentUrl().contains(Constants.landingPage));
    }

    public void logoutMercuryTours(){
        waitForElement(mth.btnLogout);
        mth.btnLogout.click();
    }
}
