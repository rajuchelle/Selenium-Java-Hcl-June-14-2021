package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "features/createAdhocRequest.feature",
		glue = "stepdefinition",
		monochrome = true,
		strict = true,
//		tags = {"@SanityTest"}, //"@RegressionTest"
//		format = {"pretty", "html:Reports"},
//		format = {"pretty", "json:Reports/cucumberJson.json"},
		plugin = {"pretty",
				"html:Reports1",
				"json:Reports1/cucumberJson.json",
				"junit:Reports1/cucumberJunit.xml"
				},
//		dryRun = true,
		snippets = SnippetType.CAMELCASE
)

public class TestRunner {

}
