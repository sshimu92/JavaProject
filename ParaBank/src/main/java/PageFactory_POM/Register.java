package PageFactory_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ReusableFunctions;

public class Register {

    WebDriver driver;
    ReusableFunctions reusablefunctions;
    
	
	public Register(WebDriver driver) {
		
		this.driver = driver;
	    this.reusablefunctions = new ReusableFunctions(driver);
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement clickregister;
	
	
	
	public void clickOnRegisterButton() {
		
		clickregister.click();
	}
	
}
