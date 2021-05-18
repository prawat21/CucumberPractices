package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:/Users/Puneet.Rawat/MyAutomationProjects/CucumberPractices/src/test/resources/Registration.feature"},
		glue = {"stepdefinitions"},
				plugin = {"pretty",
						"json:target/MyReports/report.json",
						"junit:target/MyReports/report.xml"
					},
			monochrome = true, // for printing proper Alignment/format on console
			//publish = true // for publishing report
			dryRun = true // just check which stepdefinition is missing against any line from feature file
		)
public class RegUserRunner {

}
