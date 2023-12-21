package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

//ThankyouPage class is created

public class ThankyouPage {

	// Locating the 'continuebtn'  using XPath

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")

	WebElement continuebtn;

	 // Constructor for ThankyouPage class, initializing WebElements using PageFactory

	public ThankyouPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Method to click on the continue button

	public void thankyou() {

		continuebtn.click();

 
	}

}
