package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import miniFramework.BrowserConfiguration;
import miniFramework.LoginPage;

public class LoginTest {

//	 WebDriver driver;
	 
	
	@Test
	public void register(WebDriver driver) {
		
		LoginPage lg = new LoginPage(driver);
		
		lg.clickOnRegisterButton();
		
	}
	
}
