package TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.ReusableFunctions;
import PageFactory_POM.Login;
import Utilities.ListenerUtils;


@Listeners(ListenerUtils.class)
public class SampleTest {

	private WebDriver driver;
    private ReusableFunctions reusableFunctions;
    private Login login;

    @BeforeTest
    public void beforeTest() {
       
    	driver = ReusableFunctions.invokeBrowser();
        reusableFunctions = new ReusableFunctions(driver);
        login = new Login(driver);
    }
    @Test
    public void tescase1() {
       
    	reusableFunctions.openWebsite("https://mycontactform.com/");
        
    	assertEquals(driver.getCurrentUrl(), "https://mycontactform.com/");
        assertEquals(driver.getTitle(), "Free Contact and Email Forms - myContactForm.com");
    }
    @Test
	public void testcase2() {
		
    	login.enterUserName("admin");
		login.enterPassword("admin");
		login.clickLogin();
		
		assertEquals(driver.getCurrentUrl(), "https://www.mycontactform.com/");
	    assertEquals(driver.getTitle(), "Free Contact and Email Forms - myContactForm.com");
	}
}
