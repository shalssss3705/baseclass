
package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import com.demowebshop.base.BaseClass;

//Page class representing the second step in the registration process

public class Register1Page {

	WebDriver driver;

	// Locating the 'continue button ' input field

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")

	WebElement continuebtn;
 
	//Created the Constructor that initializing PageFactory and WebElement instances

	public Register1Page(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
 
	// Method to perform the registration continuation

    // It clicks on the 'Continue' button to proceed to the next step

    // It returns an instance of HomePage, representing the home page

	public HomePage registering() {

		continuebtn.click();

		// Returning an instance of HomePage

		return new HomePage(BaseClass.driver);

	}

}
