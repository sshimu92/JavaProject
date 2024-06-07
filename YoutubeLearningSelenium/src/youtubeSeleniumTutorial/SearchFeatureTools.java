package youtubeSeleniumTutorial;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

import org.junit.Test;

public class SearchFeatureTools {

	@Test
	public void searchProductByKeyword() throws InterruptedException {
		
		WebDriver driver= Base.getDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Printed Dress");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		int total_num_img= driver.findElements(By.xpath("//img[contains(@data-image-index,'1')]")).size();
		
		
		Assert.assertEquals(18, total_num_img);
		
		
	
	}
	
	
}
