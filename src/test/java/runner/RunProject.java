package runner;

import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Swd;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static utils.Commons.getDateTimeStamp;
import static utils.Constants.userDirPath;


@CucumberOptions(
        plugin = {"json:target/negative/cucumber.json", "pretty", "html:target/negative/cucumber.html",
                "com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src/test/java/features",
        glue = "steps",
        tags = {"@Login, @api"}
)

public class RunProject extends AbstractTestNGCucumberTests {

    public static String currentDateTime;

    @BeforeClass
    void setupAllConfigs(){
        Swd.getDriver();

        currentDateTime = getDateTimeStamp();
        String reqFileName = "ExtRep_" + currentDateTime + ".html";
        ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File( userDirPath + "/ExtentReport/" + reqFileName ),false);
        ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));

        ExtentCucumberFormatter.addSystemInfo("Browser Name", "Firefox");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.5");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }


    @AfterClass
    void closeBrowser(){
        Swd.closeBrowser();
    }

}
