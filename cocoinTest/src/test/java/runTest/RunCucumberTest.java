package runTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features",
        // glue = "runTest",
//        tags="@Login",
        plugin = {"pretty"})

public class RunCucumberTest {
}