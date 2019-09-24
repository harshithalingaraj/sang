package package7;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


	@CucumberOptions(
			//features={"src/main/java/package7/developer.feature","src/main/java/package7/tester.feature"}
			//name={"To check good tester"}
			tags={"@smoke or @sanity"}
			)

public class Custom1 {
			}
