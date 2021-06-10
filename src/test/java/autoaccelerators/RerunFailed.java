package autoaccelerators;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"pretty",
                 "rerun:target/rerunFailed.txt"
        },
        features = {"@target/rerunFailed.txt"},
        glue = {"autoaccelerators"}

)

public class RerunFailed extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
