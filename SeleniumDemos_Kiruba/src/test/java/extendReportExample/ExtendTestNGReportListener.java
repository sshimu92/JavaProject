package extendReportExample;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reportSample.SampleTest1;

public class ExtendTestNGReportListener implements ITestListener{

	//extentreport is a class provided by extentreports; we will create an object of it and create a report
	private ExtentReports extent;
	
	//extenttest is a class provided by extentreports; we will create an object of it and create a test case
	private ExtentTest extentTest;
	
	public ExtendTestNGReportListener() {
		
		//specify location of the report where you want to generate the report
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("reports//extentreport.html");
		
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		//create object of ExtentReports class
		extent = new ExtentReports();
		
		//attach the html report to the report object
		extent.attachReporter(htmlReporter);
	
	}
	
	public void onStart(ITestContext result) {
		
		System.out.println("Test Started->"+ result.getName());
	}

    public void onTestStart(ITestResult result) {
		
		System.out.println("Test Started->"+ result.getMethod().getMethodName());
		extentTest = extent.createTest(result.getMethod().getMethodName());
	}

    public void onTestSuccess(ITestResult result) {
    	
    	System.out.println("Test Passed->"+ result.getMethod().getMethodName());
    	extentTest.pass("Test Passed");
    	
    }

    public void onTestFailure(ITestResult result) {
    	
    	System.out.println("Test Failed->"+ result.getMethod().getMethodName());
    	String screenshotloc="./screenshots/";
        String failedTest=result.getName();
    	extentTest.fail(result.getThrowable());
    	
    	extentTest.addScreenCaptureFromPath(screenshotloc+failedTest+".png")
        .fail(MediaEntityBuilder.createScreenCaptureFromPath(screenshotloc+failedTest+".png").build());
      
        Object testclass=result.getInstance();
        
        WebDriver driver=((SampleTest1)testclass).getDriver();
        
        if(driver!=null) {
            String fileName=captureScreen(driver, result.getMethod().getMethodName());
            System.out.println(fileName);
            
        }
    }

    public void onTestSkipped(ITestResult result) {

		System.out.println("Test Skipped->" + result.getMethod().getMethodName());
		extentTest.skip(result.getThrowable());
		
    }

	public void onFinish(ITestContext result) {

		System.out.println("Test Finished->" + result.getName());
		
		//flushing the report to write all information to the html file
		extent.flush();
	} 
	private String captureScreen(WebDriver driver, String methodName)  {
        
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = methodName + "_" + timeStamp + ".png";
        
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") + "/screenshots/" + fileName;
            Files.copy(screenshot.toPath(), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
            
            return fileName;
          
        }catch(Exception e) {
            
        	e.printStackTrace();
        }
       
        return null;
    }
}
