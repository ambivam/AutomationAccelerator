package autoaccelerators;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        features = {"src/test/resources/autoaccelerators/LoginPage.feature"},
        glue = {"autoaccelerators"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",
                "rerun:target/rerunFailed.txt"
        }
)

public class MyTestRunner extends AbstractTestNGCucumberTests {

        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}