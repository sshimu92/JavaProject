package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;
import miniFrameWork.MyShop_SigninPage;

public class MyShopLoginTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = BrowserConfiguration.browserConfiguration();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
	}
	
	@Test
	public void Signin() {
		
		MyShop_SigninPage si = new MyShop_SigninPage(driver);
		
		si.setUserName("shawon.shimu@yahoo.com");
		si.setPassword("123466");
		si.signIn();
		si.forgotPassword();
		
	}

	@AfterTest
	public void tearDown() {
		
		//driver.quit();
	}
}
