package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;
 
//ShippingAddressPage class is created

public class ShippingAddressPage {
 
	  // Locating the 'checkbox' input field using XPath

	@FindBy(xpath="//input[@id='PickUpInStore' and @name='PickUpInStore' and @type='checkbox' and @value='true']") 

	WebElement checkbox;

	 // Locating the 'continuebtn' input field using XPath

	@FindBy(xpath="//input[@onclick=\"Shipping.save()\"]")

	WebElement continuebtn;

	// Constructor for ShippingAddressPage class, initializing WebElements using PageFactory

	public ShippingAddressPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Method to perform shipping actions, click on the checkbox, click continue, and navigate to the Payment page

	public PaymentPage shipping() {

		checkbox.click();	

		continuebtn.click();

		// instance of the PaymentPage after clicking the continue button

		return new PaymentPage(BaseClass.driver);

	}

}
