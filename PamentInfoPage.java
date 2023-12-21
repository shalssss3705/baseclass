package com.demowebshop.page;
//Importing necessary WebDriver and WebElement classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;
//PamentInfoPage class is created
public class PamentInfoPage {
	// Locating the 'continue button ' input field
	@FindBy(xpath="//input[@onclick=\"PaymentInfo.save()\"]")
	WebElement continuebtn;
	// Constructor for PaymentInfoPage class, initializing WebElements using PageFactory
	public PamentInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	   // Method to perform payment information actions, click on the continue button, and navigate to the Confirm page
	  public ConfirmPage paymentInfo() {
		continuebtn.click();
		// instance of the ConfirmPage after clicking the continue button
		return new ConfirmPage(BaseClass.driver);
	}
}
