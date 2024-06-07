package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "Email")
	 WebElement email;
	
	@FindBy(id = "Password")
	 WebElement password;
	
	@FindBy(className = "button-1 login-button")
	 WebElement login;
	
	@FindBy(linkText = "Logout")
	 WebElement logout;
	
	
	public void enterEmailAddress(String emailAddress) {
		
		email.clear();
		email.sendKeys(emailAddress);
	}
	
	public void enterPassword(String pwd) {
		
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		
		login.click();
	}

	public void clickOnLogOutButton() {
		
		logout.click();
	}
}
