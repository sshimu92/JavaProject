package miniFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private static WebDriver driver;
    
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	    BrowserConfiguration.browserConfig();
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement clickregister;
	
	
	
	public void clickOnRegisterButton() {
		
		clickregister.click();
	}
	
}
