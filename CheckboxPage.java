package com.demowebshop.page;

//Import statements for necessary Selenium and custom classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
 
import com.demowebshop.base.BaseClass;
 
//CheckboxPage class is created

public class CheckboxPage {
 
	  // Locating the 'company' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_Company\"]")

	WebElement company;

	// Locating the 'country' input field using XPath

	@FindBy(xpath="//select[@id=\"BillingNewAddress_CountryId\"]")

	WebElement country1;

	// Locating the 'city ' input field using XPath

	@FindBy(xpath="//input[@name=\"BillingNewAddress.City\"]")

	WebElement city ;

	// Locating the 'address1' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_Address1\"]")

	WebElement address1;

	// Locating the 'address2' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_Address2\"]")

	WebElement address2;

	// Locating the 'postalcode' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_ZipPostalCode\"]")

	WebElement postalcode;

	// Locating the 'phonenum' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_PhoneNumber\"]")

	WebElement phonenum;

	// Locating the 'faxnum' input field using XPath

	@FindBy(xpath="//input[@id=\"BillingNewAddress_FaxNumber\"]")

	WebElement faxnum ;

	// Locating the 'continuebtn' input field using XPath

	@FindBy(xpath="//input[@onclick=\"Billing.save()\"]")

	WebElement continuebtn;

	// Constructor for CheckboxPage class, initializing WebElements using PageFactory

	public CheckboxPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	 // Method to select a country from a dropdown using Select class

	public void selectCountry() {

	        Select se = new Select(country1);

	        se.selectByValue("41");

	    }

	// Method to fill in the form fields with provided data and click on the continue button

	public ShippingAddressPage checkbox(String Company , String city1 , String add1, String add2, String postalcd,

			String phonNum, String faxNum) {

		  company.sendKeys(Company);

		  selectCountry();

		  city.sendKeys(city1);

		  address1.sendKeys(add1);

		  address2.sendKeys(add2);

		  postalcode.sendKeys(postalcd);

		  phonenum.sendKeys(phonNum);

		  faxnum.sendKeys(faxNum);

		  continuebtn.click();

		// instance of ShippingAddressPage after clicking the continue button

		  return new ShippingAddressPage(BaseClass.driver);

	}

}
 