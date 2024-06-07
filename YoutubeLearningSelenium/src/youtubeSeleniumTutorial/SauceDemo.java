package youtubeSeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver= Base.getDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.className("inventory_item_img")).click();
		
		WebElement Swag_Labs= driver.findElement(By.className("app_logo"));
		
		String Swag_Labs_text= Swag_Labs.getText();
		
		System.out.println(Swag_Labs_text);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
