package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursHome {

    @FindBy( css ="input[name='userName']")
    public WebElement inputUserName;

    @FindBy( css ="input[name='password']")
    public WebElement inputPassword;

    @FindBy( css = "input[name='login']")
    public WebElement btnLogin;

    @FindBy( css = "td[class='mouseOut']:nth-child(1) > a")
    public WebElement btnLogout;
}
