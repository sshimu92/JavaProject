package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;
import miniFrameWork.LoginPage;

public class LoginTestCase {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = BrowserConfiguration.browserConfiguration();
		
		driver.get("https://www.mycontactform.com");
		
	}
	
	@Test
    public void login() {
		
		LoginPage login = new LoginPage(driver);
		
		login.setUsername("Admin");
		
		login.setPassword("password");
		
		login.clickLogin();
		
		
		//assertEquals("https://www.mycontactform.com",driver.getCurrentUrl();
		
	}
    
    @AfterTest
    public void tearDown() {
	
    	driver.quit();
	}
}
