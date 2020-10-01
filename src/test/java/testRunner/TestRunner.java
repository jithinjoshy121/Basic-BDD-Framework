package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="C://Users//Thinkpad T430//Downloads//SeleniumCucumber//Features//OrangeHRM.feature",
        glue="stepDefinitions"
)
public class TestRunner {

}
