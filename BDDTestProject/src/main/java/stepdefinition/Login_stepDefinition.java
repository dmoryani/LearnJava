package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.Login_PageObejcts;

public class Login_stepDefinition {

	WebDriver driver = Hooks.driver;
	Login_PageObejcts login_object = PageFactory.initElements(driver, Login_PageObejcts.class);
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Selenium\\Divya\\report.html");
	ExtentReports extentreport = new ExtentReports();

	
	@Given("^user is already on login page$")
	
	public void user_already_on_login_page(){
		login_object.loginToDMHUB();
		
		//Login_PageObejcts login_object = new Login_PageObejcts();
		extentreport.attachReporter(reporter);
		ExtentTest logger1 =extentreport.createTest("Login to DMHUB Test");
		logger1.log(Status.INFO, "Login to DMHUB");
		logger1.log(Status.PASS, "Logged in successfull");
		extentreport.flush();
		
		
		
	}
	@When("^user enters the login credentails$")
	public void user_enters_the_login_credentails() throws Throwable {
		//extentreport.attachReporter(reporter);
		login_object.loginToDMHUB();
		ExtentTest logger2 =extentreport.createTest("Login to DMHUB Test -TC 2");
		logger2.log(Status.INFO, "Login to DMHUB -TC 2");
		logger2.log(Status.PASS, "Logged in successfull -TC 2");
		
		extentreport.flush();
		
		
		
		
		
	}
	
	
}
