package miniFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SampleFormsPage {

	public WebDriver driver;
	
	public SampleFormsPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[@class='highlighttab']")
	private WebElement clickOnSampleForms;
	
	@FindBy(xpath="//input[@id='subject']")
	private WebElement subject;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailAddress;
	
	@FindBy(xpath="//input[@id='q1']")
	private WebElement textBox;
	
	@FindBy(id="q2")
	private WebElement multiText;
	
	@FindBy(xpath="//input[@type='checkbox'][@value='2']")
	private WebElement sendTo;
	
	@FindBy(id="q4")
	private WebElement radioButtons;
	
	@FindBy(xpath="//input[@value='Second Check Box']")
	private WebElement multiAnswer;
	
	@FindBy(id="q3")
	private WebElement dropDown;
	
	@FindBy(id="q8")
	private WebElement states;
	
	@FindBy(id="q9")
	private WebElement countries;
	
	@FindBy(id="q10")
	private WebElement provinces;
	
	@FindBy(name="q11_title")
	private WebElement name;
	
	@FindBy(name="q11_first")
	private WebElement firstname;
	
	@FindBy(name="q11_last")
	private WebElement lastname;
	
	
	
	 public void clickSampleForms() {
			
			clickOnSampleForms.click();
		}

		public void setSubject(String Subject) {
			
			subject.sendKeys(Subject);
			
			
		}

		public void setEmailAddress(String EmailAddress) {
			
			emailAddress.sendKeys(EmailAddress);
			
		}

		public void setTextBox(String TextBox) {
			
			textBox.sendKeys(TextBox);
			
		}

		public void setMultiTextBox(String MultiText) {
			
			multiText.sendKeys(MultiText);
		}

		public void clickSendTo() {

			sendTo.click();
			
		}

		public void clickRadioButtons() {
			
			radioButtons.click();
		}

		public void clickMultiAnswer() {
			
			multiAnswer.click();
		}

		public void dropDownBox(String q3) {
			   
			   Select s = new Select(dropDown);
			   
			   s.selectByVisibleText(q3);
			   
			   
		   }

		public void selectStates(String q8) {
			
			Select s1 = new Select(states);
			
			s1.selectByVisibleText(q8);
		}

		public void selectCountries(String q9) {
			
			Select s2 = new Select(countries);
			
			s2.selectByVisibleText(q9);
	
		}

		public void selectProvince(String q10) {
			
           Select s3 = new Select(provinces);
			
           s3.selectByVisibleText(q10);
			
		}

		public void selectName(String q11_title) {
			
			Select s4 = new Select(name);
			
			s4.selectByVisibleText(q11_title);
		}

        public void selectFirstNameBox(String q11_first) {
			
        	firstname.sendKeys(q11_first);
			
		}

        public void selectLastNameBox(String q11_last) {
        	
        	lastname.sendKeys(q11_last);
        }
}