package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;
 
//ConfirmPage  class is created

public class ConfirmPage {

	// Locating the 'continuebtn'  using XPath

	@FindBy(xpath="//input[@onclick=\"ConfirmOrder.save()\"]")

	WebElement continuebtn;

	// Constructor for ConfirmPage class, initializing WebElements using PageFactory

	public ConfirmPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	 // Method to confirm the order, click on the continue button, and navigate to the Thank You page

	public ThankyouPage confirm() {

		continuebtn.click();

		//  instance of the ThankyouPage after clicking the continue button

		return new ThankyouPage(BaseClass.driver);

	}

}
