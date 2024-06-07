package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("shawon.shimu@yahoo.com");

		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("1234");

		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

	}

}
