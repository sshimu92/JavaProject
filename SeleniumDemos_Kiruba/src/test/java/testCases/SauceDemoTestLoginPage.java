package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import miniFrameWork.BrowserConfiguration;
import miniFrameWork.SauceDemoLoginPage;

public class SauceDemoTestLoginPage {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = BrowserConfiguration.browserConfiguration();
		
		driver.get("https://www.saucedemo.com/");
		
	}

	@Test
	public void Login() {
		
		SauceDemoLoginPage log = new SauceDemoLoginPage(driver);

		log.userName("standard_user");
		log.passWord("secret_sauce");
		log.clickLogin();
	}

	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
