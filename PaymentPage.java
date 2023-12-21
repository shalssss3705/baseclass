package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;

//PaymentPage class is created

public class PaymentPage {

	// Locating the 'radiobtn' input field

	@FindBy(xpath="//input[@id=\"paymentmethod_0\"]")

	WebElement radiobtn;

	// Locating the 'continuebtn' input field

	@FindBy(xpath="//input[@onclick=\"PaymentMethod.save()\"]")

	WebElement continuebtn;

	 // Constructor for PaymentPage class, initializing WebElements using PageFactory

	public PaymentPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Method to perform payment actions, click on the radio button, click continue, and navigate to the Payment Information page

	public PamentInfoPage payment() {

		radiobtn.click();

		continuebtn.click();

		// Returns a new instance of the PamentInfoPage after clicking the continue button

		return new PamentInfoPage(BaseClass.driver);

		}

	}
 