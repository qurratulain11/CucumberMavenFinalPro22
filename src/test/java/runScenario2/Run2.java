package runScenario2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src\\test\\java\\features\\ChangetoWhite2.feature",
			glue="steps",
//			tags="",
					
			monochrome=true,
			dryRun = false,
			plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json"
			}
			)
			
				public class Run2 {

				}
			