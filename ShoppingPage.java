package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

import com.demowebshop.base.BaseClass;
 
// ShoppingPage class is created

public class ShoppingPage {

	// Locating the 'Shopping cart' link using XPath

    @FindBy(xpath="//span[text()='Shopping cart']")

    WebElement shoppingcart;

    // Locating the 'Country' dropdown menu using XPath

    @FindBy(xpath = "//select[@id='CountryId']")

    WebElement country;

    // Locating the 'Zip/Postal Code' input field using XPath

    @FindBy(xpath="//input[@id='ZipPostalCode']")

    WebElement zipcode;
 
    // Locating the 'Estimate Shipping' button using XPath

    @FindBy(xpath="//input[@name='estimateshipping']")

    WebElement estimate;
 
    // Locating the 'Terms of Service' checkbox using XPath

    @FindBy(xpath="//input[@name='termsofservice']")

    WebElement checkbox;
 
    // Locating the 'Checkout' button using XPath

    @FindBy(xpath="//button[@id='checkout']")

    WebElement checkout;
 
 
    // Constructor initializing PageFactory and WebElement instances

	public ShoppingPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Method is created to select a country from the dropdown menu

	public void selectCountry() {

        Select se = new Select(country);

        se.selectByValue("41");

    }
 
	

	// Method to perform shopping , including selecting a country, entering a zip code,

    // estimating shipping, clicking on  checkbox, and clicking the 'Checkout' button

    // It returns an instance of CheckboxPage, representing the checkbox page after shopping actions

    public CheckboxPage shopping(String zipcod ) {

        shoppingcart.click();

        selectCountry();

        zipcode.sendKeys(zipcod); 

        estimate.click();

        checkbox.click();

        checkout.click();

        // Returning an instance of CheckboxPage

        return new CheckboxPage(BaseClass.driver);

    }

}
