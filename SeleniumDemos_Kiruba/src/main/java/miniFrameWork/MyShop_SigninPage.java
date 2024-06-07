package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyShop_SigninPage {

	public WebDriver driver;
	
	public MyShop_SigninPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id ="email")
	private WebElement username;
	
	@FindBy(id ="passwd")
	private WebElement password;
	
	@FindBy(id ="SubmitLogin")
	private WebElement signin;
	
	@FindBy(xpath ="//a[contains(@title,'Recover your forgotten password')]")
	private WebElement forgotpwd;
	
	
	
	public void setUserName(String email) {
		
		username.sendKeys(email);
	}
	
	public void setPassword(String passwd) {
		
		password.sendKeys(passwd);
	}

	public void signIn() {
		
		signin.click();
	}

	public void forgotPassword() {
		
		forgotpwd.click();
	}
}
