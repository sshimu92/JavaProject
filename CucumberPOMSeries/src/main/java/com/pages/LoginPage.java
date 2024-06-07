package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By singInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
		
	}

	public boolean isForgotpwdLinkExist() {
		
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

}
