package utils;


import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Swd {

    public static WebDriver myChromeDriver;

    public Swd(){
    }

    public static WebDriver getDriver(){
        setUpDriver();
        return myChromeDriver;
    }

    public static void setUpDriver() {
        if(myChromeDriver == null){
            WebDriverManager.getInstance(ChromeDriver.class).setup();
            myChromeDriver = new ChromeDriver();
        }
    }

    public static void closeBrowser(){
        myChromeDriver.quit();
    }

    public static void takeScreenShot(Scenario scenario){
        byte[] screenBytes=((TakesScreenshot)
                myChromeDriver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenBytes,"image/png");
    }

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Swd.getDriver(),20000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }





}
