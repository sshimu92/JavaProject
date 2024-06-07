package basics;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateElements {

	public WebDriver driver;

	@BeforeTest
	public void browserSetup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications"); // To disable notifications

		options.addArguments("--start-maximized");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

	}

	@Test
	public void stage1() {

		WebElement ele = driver.findElement(By.id("APjFqb"));

		boolean isElementPresent = ele.isDisplayed();

		assertTrue(isElementPresent);

	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
  
}
