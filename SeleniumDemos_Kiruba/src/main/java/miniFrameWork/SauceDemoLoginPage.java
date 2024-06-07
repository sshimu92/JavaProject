package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginPage {

	public WebDriver driver;
	
	public SauceDemoLoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;
	
	@FindBy(tagName="Swag Labs")
	private WebElement text;
	
	
   public void userName(String user) {
		
		username.sendKeys(user);
		
   }
	
   public void passWord(String pass) {
		
		password.sendKeys(pass);
}

   public void clickLogin() {
	   
	   login.click();
   }

}