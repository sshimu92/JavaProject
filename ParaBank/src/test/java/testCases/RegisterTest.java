package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageFactory_POM.Register;
import base.ReusableFunctions;
import junit.framework.Assert;

public class RegisterTest {

	private WebDriver driver;
	private ReusableFunctions reusablefunctions;
	private Register register;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = ReusableFunctions.invokeBrowser();
		reusablefunctions = new ReusableFunctions(driver);
		register = new Register(driver);
		
	}
	
	@Test
	public void testCase1() {
		
		reusablefunctions.openWebsite("https://parabank.parasoft.com/");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://parabank.parasoft.com/parabank/index.htm;jsessionid=A816EE7EE5EF6AFC5C6E94C6510C769C");
		Assert.assertEquals(driver.getTitle(), "Welcome to ParaBank");
		
	}
	
	@Test
	public void testCase2() {
		
		register.clickOnRegisterButton();
		
	}

	@AfterTest
	public void tearDown() {
		
		reusablefunctions.closeBrowser();
	}
}
