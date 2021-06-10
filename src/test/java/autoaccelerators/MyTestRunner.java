package autoaccelerators;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        features = {"src/test/resources/autoaccelerators/"},
        glue = {"autoaccelerators"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        }

)

public class MyTestRunner extends AbstractTestNGCucumberTests {

        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}