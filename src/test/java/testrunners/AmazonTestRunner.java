package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Search.feature"},
		glue = {"stepdefinitions","MyHooks"},
		tags = "@All" ,
		plugin = {"pretty",
					"json:target/MyReports/report.json",
					"junit:target/MyReports/report.xml"
				},
		monochrome = true, // for printing proper Alignment/format on console
		//publish = true // for publishing report
		dryRun = true // just check which stepdefinition is missing against any line from feature file
				
		)
public class AmazonTestRunner {
	

}
