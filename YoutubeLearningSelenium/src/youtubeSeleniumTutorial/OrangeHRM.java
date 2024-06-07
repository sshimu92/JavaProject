package youtubeSeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= Base.getDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[contains(@fdprocessedid,'vkthw9')]")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
