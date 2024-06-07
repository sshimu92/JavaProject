package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
		
        ChromeOptions options= new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sample Forms")).click();
		
		//Find how many links in this page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links in the Page are: "+ links.size());
		
		List<WebElement> textBoxes = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println("Total number of Text Boxes are: "+ textBoxes.size());
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type= 'checkbox']"));
		
		System.out.println("Total Check Boxes are: "+ checkBoxes.size());
		
		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type= 'radio']"));
		
		System.out.println("Total Radio Buttons are: "+ radioButtons.size());
		
	}
}
