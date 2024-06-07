package basics;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {

	public static void main(String[] args) {
		
        ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'mycontactform.com/samples')]"));
		
		//System.out.println("Total Number of Links in the Page are: "+ links.size());
		
		for(int i = 0; i<=links.size(); i++) {
			
			//System.out.println(links.get(i).getAttribute("href"));
		
			WebElement ele = links.get(i);
			
			ele.click();
			
		}
		
		//Take ScreenShot
		File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Save the 
		try {
			
			FileUtils.copyFile(screenShot, new File("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\ScreenShots\\photo.jpg"));
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
