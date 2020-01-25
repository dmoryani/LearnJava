package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
	public static WebDriver driver;

	
	
	@Before
	
	public void setUp(){
		
		System.out.println("Initailize the setup");
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Divya\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String URL = "https://app.convertwork.cn/login.html";
		driver.get(URL);
	
		
		
	}
	
	@After
	
	
	public void logout(){
		
		driver.close();
		
	}

}
