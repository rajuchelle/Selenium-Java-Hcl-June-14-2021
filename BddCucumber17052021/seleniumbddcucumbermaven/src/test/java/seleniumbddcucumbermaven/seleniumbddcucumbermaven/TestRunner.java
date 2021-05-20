package seleniumbddcucumbermaven.seleniumbddcucumbermaven;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "features/accountcreation.feature",
		glue = "stepdefinition",
		monochrome = true,
		strict = true,
//		tags = {"@RegressionTest"}, //"@RegressionTest"
//		format = {"pretty", "html:Reports"},
//		format = {"pretty", "json:Reports/cucumberJson.json"},
		plugin = {"pretty",
				"html:target",
				"json:target/cucumberJson.json",
				"junit:target/cucumberJunit.xml",
				"rerun:target/failedCases.txt"
				},
//		dryRun = true,
		snippets = SnippetType.CAMELCASE
)

public class TestRunner {

}
