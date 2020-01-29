package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"src/test/java/features/NegativeLogins.feature"},
			glue = {"steps", "utils"},
			plugin = {"pretty","html:target/cucumber"},
			dryRun = false,
			monochrome = true, 
			strict = true
			)
public class RunCukeTest {
}