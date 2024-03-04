package testNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue={"mainSteps","hooks"},monochrome = true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

    //to Run in parallel incorporate page Objects
}
