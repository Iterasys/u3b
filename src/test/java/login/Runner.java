package login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				dryRun = false,
				features =
							{	"src/test/resources/login/" },
							
				glue =		{	"login/" },
				
				monochrome = true,
				
				plugin	= 	{	"pretty",
								"html:target/cucumber-htmlreport",
								"json:target/cucumber-report.json",
								"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"
							}
				)
public class Runner {

	public static void writeExtentReport() {
		
	}
	
}