package stepdefinitions;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

	WebDriver driver;
	
	@Given("User already open the website sauce demo")
	public void user_already_open_the_website_sauce_demo() {
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}

	@When("User input {string} as username {string} as password")
	public void user_input_as_username_as_password(String string, String string2) {
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		
	}

	@When("User filters the list of product by text {string}")
	public void user_filters_the_list_of_product_by_text(String string) {
	  
		Select s = new Select(driver.findElement(By.className("product_sort_container")));
		s.selectByVisibleText("Name (Z to A)");

		
	}

	@When("User clicking {string} of item into a cart")
	public void user_clicking_of_item_into_a_cart(String string) {
	    
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//		driver.findElement(By.className("shopping_cart_link")).click();

	
	}

	@When("User navigating to cart page")
	public void user_navigating_to_cart_page() {
		
		driver.findElement(By.className("shopping_cart_link")).click();
	    
		
	}

	@Then("User already on {string} as cart page")
	public void user_already_on_as_cart_page(String string) {
	   
		
		WebElement cartPage = driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println(cartPage.getAttribute("Your Cart"));
		
//		assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");
		
	}

	@When("User remove first item in cart")
	public void user_remove_first_item_in_cart() {
	    
//		driver.findElement(By.id("remove-sauce-labs-onesie")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
		
		
	}

	@When("User navigating to checkout page")
	public void user_navigating_to_checkout_page() {
	    
		driver.findElement(By.id("checkout")).click();
	}

	@When("User filling {string} as firstName, {string} as lastName and {string} as postal code")
	public void user_filling_as_first_name_as_last_name_and_as_postal_code(String string, String string2, String string3) {
	  
		driver.findElement(By.id("first-name")).sendKeys("Shawon");
		driver.findElement(By.id("last-name")).sendKeys("Shimu");
		driver.findElement(By.id("postal-code")).sendKeys("97333");
		
		
	}

	@When("User navigating to checkout overview page")
	public void user_navigating_to_checkout_overview_page() {
	   
		driver.findElement(By.id("continue")).click();
		
	}

	@Then("User verifying item total and tax price")
	public void user_verifying_item_total_and_tax_price() {
	    
		WebElement itemTotal = driver.findElement(By.className("cart_quantity"));
		boolean verifyItemTotal = itemTotal.equals(15.99);
		System.out.println(verifyItemTotal);
		
		WebElement taxPrice = driver.findElement(By.className("summary_tax_label"));
		boolean verifyTaxPrice = taxPrice.equals(1.28);
		System.out.println(verifyTaxPrice);
		
	}

	@Then("User navigating to checkout complete page and going back to home page")
	public void user_navigating_to_checkout_complete_page_and_going_back_to_home_page() {
	    
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("back-to-products")).click();
		
	}

	
}
