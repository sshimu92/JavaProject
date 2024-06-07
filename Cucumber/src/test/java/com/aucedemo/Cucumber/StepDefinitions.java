package com.aucedemo.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinitions {
	
	public WebDriver driver;

@Before
public void initializeDriver() {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();	
	
	this.driver=driver;
}

@After
public void closeDriver() throws InterruptedException {
	Thread.sleep(4000);
	driver.quit();
}

@Given("User is in homepage")
public void user_is_in_homepage() {
    
	driver.get("https://www.saucedemo.com");
	
}

@When("Clicks on login button")
public void clicks_on_login_button() {
	
	driver.findElement(By.id("login-button")).click();
	
}

@Then("User see the login page")
public void user_see_the_login_page() {
   
	String str=driver.findElement(By.className("login_logo")).getText();
	Assert.assertEquals("Swag Labs", str);
}

@Then("enter username {string}")
public void enter_username(String string) {
    
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
}

@Then("enter password {string}")
public void enter_password(String string) {
    
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
}

@Then("click login button")
public void click_login_button() {
    
	driver.findElement(By.id("login-button")).click();
}

@Then("user redirected to the Swag Labs Page")
public void user_redirected_to_the_Swag_Labs_page() {

	String str= driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]")).getText();
	Assert.assertEquals("Swag Labs", str);
}

@Then("user sees the error message")
public void user_sees_the_error_message() {
    
	String str= driver.findElement(By.xpath("//h3[contains(@data-test,'error')]")).getText();
	Assert.assertEquals("Username and password do not match any user in this service", str);
	
}


}
