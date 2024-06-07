package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseTest {

	public AndroidDriver driver;
	
	@BeforeTest
    public void setup() throws MalformedURLException {
        
		UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Shimus Phone");
        options.setApp("C:\\Users\\shimu\\eclipse-workspace\\AppiumDemos\\src\\test\\resources\\resources\\ApiDemos-debug.apk");
        options.setPlatformName("Android");
//        options.setAppPackage("com.google.android.apps.messaging");
//        options.setAppActivity("com.google.android.apps.messaging.ui.ConversationListActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @Test
    public void test() {
//        System.out.println("App Opened");
    	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
    	driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
    	driver.findElement(By.id("android:id/checkbox")).click();
    	driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]\r\n")).click();
    	driver.findElement(By.id("android:id/edit")).sendKeys("Shimu");
    	driver.findElement(By.id("android:id/button1")).click();
//    	driver.findElement(AppiumBy.id(""))
//    	driver.findElement(AppiumBy.accessibilityId(""))
    }
	
}
