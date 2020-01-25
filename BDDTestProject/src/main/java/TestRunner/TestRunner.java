package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\Divya\\workspace\\BDDTestProject\\src\\main\\java\\Features",
		glue = {"stepdefinition"},
		format=	{"pretty","html:test-output"}
		
		)



public class TestRunner {

}
