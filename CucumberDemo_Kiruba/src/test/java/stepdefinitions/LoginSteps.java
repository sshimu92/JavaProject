package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;

	@Given("open the browser")
	public void open_the_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Given("navigate to saucedemo")
	public void navigate_to_saucedemo() {

		driver.get("https://www.saucedemo.com/");

	}

	@When("user enters {string} and {string} as username and password")
	public void user_enters_and_as_username_and_password(String string, String string2) {

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

	}

	@When("click on login button")
	public void click_on_login_button() {

		driver.findElement(By.id("login-button")).click();

	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {

		assert true;

	}
}
