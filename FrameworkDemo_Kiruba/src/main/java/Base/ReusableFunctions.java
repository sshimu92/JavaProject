package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;



import Utilities.ExtentManager;

public class ReusableFunctions {

	
	private static WebDriver driver;
	private WebDriverWait wait;
	
	public ReusableFunctions(WebDriver driver) {

		this.driver = driver;

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	}

	public static WebDriver invokeBrowser() {
		
		return driver= DriverSetup.invokeBrowser();
	}
	
	public void openWebsite(String url) {

		driver.get(url);
	}

	public void setText(WebElement element, String text) {

		waitForElementToBeVisible(element);
		
		element.clear();
		
		element.sendKeys(text);
	}

	public void click(WebElement element) {

		waitForElementToBeVisible(element);
		element.click();
	}

	public void waitForElementToBeVisible(WebElement element) {

		wait.until(ExpectedConditions.visibilityOf(element));
	
	}

	//Method for selecting any option from a drop down.
	public void selectDropDown(WebElement element, String text) {
		
		waitForElementToBeVisible(element);
		
		Select s = new Select(element);
		
		s.selectByVisibleText(text);
		
	}

	//Method to get text from any elements.
	public String getText(WebElement element) {
		
		waitForElementToBeVisible(element);
		
		return element.getText();
	}

	//Method to close browser.
	public void closeBrowser() {
		
		driver.quit();
	}

	public static void takeScreenshot(String filepath) {
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		
		File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(filepath);
		
		try {
			
			FileUtils.copyFile(srcFile, destFile);
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
