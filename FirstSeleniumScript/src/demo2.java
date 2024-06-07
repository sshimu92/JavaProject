import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\NewChromeDriver\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("session_key")).sendKeys("shimu.shawon@gmail.com");
		
		driver.findElement(By.name("session_password")).sendKeys("1234");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		
		
		

	}

}
