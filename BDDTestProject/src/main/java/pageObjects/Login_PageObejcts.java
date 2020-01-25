package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import stepdefinition.Hooks;

public class Login_PageObejcts extends Hooks {

	// OR

	@FindBy(id = "username")
	public WebElement dmhub_username;

	@FindBy(id = "password")
	public WebElement dmhub_password;

	@FindBy(xpath = "//button[text()='登 入']")
	public WebElement dmhub_login_button;

	// common methods..

	public void loginToDMHUB() {

		dmhub_username.sendKeys("scrmuat@dfs.com");
		dmhub_password.sendKeys("scrmuat@DFS_1");
		dmhub_login_button.click();

	}

}
