package com.qa.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features= "F:\\eclipse-workspace\\com.qa.selenium.finalAssignment\\src\\test\\java\\com\\qa\\features\\Orange.feature",
		features= "F:\\eclipse-workspace\\com.qa.selenium.finalAssignment\\src\\test\\java\\com\\qa\\features\\Orange1.feature",
		glue= "com.qa.stepdefinition",
		dryRun= false,
		strict = true,
		monochrome = true,
		format = {"pretty" , "html:test-output"},
		tags = {"@SmokeTest","@RegressionTest"}
		
		)

public class Orange_TestRunner {

}
