package basics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Links {

	private static int i;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'mycontactform.com/samples')]"));
		
		System.out.println("Total Number of Links in the Page are: "+ links.size());
		
		for(int i = 0; i<links.size(); i++) {
			
			links = driver.findElements(By.xpath("//a[contains(@href,'mycontactform.com/samples')]"));
			
			WebElement ele = links.get(i);
			
			ele.click();
			
			 //String timesStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		       
			   File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			   
		      // LocalTime now = LocalTime.now();
				
				try {
					
					FileUtils.copyFile(screenShot, new File("C:\\Users\\shimu\\eclipse-workspace\\SeleniumDemos_Kiruba\\ScreenShots\\photo"+ i + ".jpg"));
				
				}catch(Exception e) {
					
					e.printStackTrace();
				}
			
			
		driver.close();
	}
	  

		//driver.close();
	}
}