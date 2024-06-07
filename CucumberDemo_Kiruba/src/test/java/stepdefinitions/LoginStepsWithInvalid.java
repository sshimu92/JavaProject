package stepdefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;


public class LoginStepsWithInvalid {

	WebDriver driver;
	
	@Then("user get {string} as error message")
	public void verifyUserError(String errMsg) {

		WebElement error = driver.findElement(By.cssSelector("h3"));
		assertEquals(errMsg, error.getText());

	}
	
}
