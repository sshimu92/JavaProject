package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import miniFramework.BrowserConfiguration;


public class Setup {

	 WebDriver driver;
	
	@BeforeMethod
	public void driverSetup() {
		
//		driver = BrowserConfig.browserConfig();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		System.out.println("Test is Completed");
	
	}
	
}
