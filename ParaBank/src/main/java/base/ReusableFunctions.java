package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableFunctions {

	private static WebDriver driver;
	private WebDriverWait wait;
	
	public ReusableFunctions(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	public static WebDriver invokeBrowser() {
		
		return driver = DriverSetup.invokeBrowser();
	}

	public void openWebsite(String url) {
		
		driver.get(url);
	}
	
	public void setText(WebElement element, String text) {
		
		waitForElementToBeVisible(element);
		element.clear();
		element.click();
		
	}

	private void waitForElementToBeVisible(WebElement element) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

	public void selectDropdown(WebElement element, String text) {
		
		waitForElementToBeVisible(element);
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public String setText(WebElement element) {
		
		waitForElementToBeVisible(element);
		return element.getText();
	}

	public void closeBrowser() {
		
		driver.quit();
		
	}

	public static void takeScreenShot(String filePath) {
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(src, new File("./Screenshot/"+filePath+".png"));
		
		}catch(IOException e) {
			
			System.out.println(e.getMessage());
		}
	
	}
}
