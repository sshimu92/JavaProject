package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import miniFrameWork.BrowserConfiguration;
import miniFrameWork.LoginPage;
import miniFrameWork.SampleFormsPage;

public class SampleFormsPageTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver = BrowserConfiguration.browserConfiguration();
		
		driver.get("https://www.mycontactform.com/samples.php");
	
	}

	@Test
	public void sampleForms() {

		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.clickSampleForms();
		
	}

	@Test
	public void subjectField() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.setSubject("Apartment Repair");
		
	}

	@Test
	public void emailAddressField() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.setEmailAddress("shawon.shimu@yahoo.com");
	
	}
	
	@Test
	public void textBoxField() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.setTextBox("Kitchen sink need to be fixed");
	
	}
	
	@Test
	public void multiTextBoxField() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.setMultiTextBox("Hello World!!!");
		
	}
	
	@Test
	public void checkSendTo() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.clickSendTo();
	}
	
	@Test
	public void checkRadioButtons() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.clickRadioButtons();
	}
	
	@Test
	public void checkMultiAnswerBox() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.clickMultiAnswer();
	}
	
	@Test
	public void selectDropDownBox() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.dropDownBox("Second Option");
		
	}
	
	@Test
	public void selectStatesBox() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectStates("OR");
	}
	
	@Test
	public void selectCountries() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectCountries("United States of America");
	}
	
	@Test
	public void selectProvinces() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectProvince("Ontario");
	}
	
	@Test
	public void selectNames() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectName("Mrs.");
	}
	
	@Test
	public void selectFirstName() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectFirstNameBox("Shawon");
	}
	
	@Test
	public void selectLastName() {
		
		SampleFormsPage sfp = new SampleFormsPage(driver);
		sfp.selectLastNameBox("Shimu");
	}
	
	@AfterTest
	public void tearDown() {
		
		//driver.quit();
	}
}
