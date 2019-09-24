package package6;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin={"html:src/main/java/package6/report/output",
			"json:src/main/java/package6/report/output.json",
			"junit:src/main/java/package6/report/output.xml"})
	

public class Data1 {

}
