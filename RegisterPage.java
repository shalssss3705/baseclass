
package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;

// RegisterPage class is created

public class RegisterPage {
 
	// Locating the 'Register' link on the page

	@FindBy(xpath ="//a[@class=\"ico-register\"]")

	WebElement register;

	 // Locating the 'Gender' radio button

	@FindBy(xpath="//input[@id=\"gender-female\"]")

	WebElement gender;

	// Locating the 'First Name' input field

	@FindBy(xpath="//input[@id=\"FirstName\"]")

	WebElement name;

	// Locating the 'Last Name' input field

	@FindBy(xpath="//input[@id=\"LastName\"]")

	WebElement lastname ;

	  // Locating the 'Email' input field

	@FindBy(xpath="//input[@id=\"Email\"]")

	WebElement email;

	// Locating the 'Password' input field

	@FindBy(xpath="//input[@id=\"Password\"]")

	WebElement passwd;

	// Locating the 'Confirm Password' input field

	@FindBy(xpath="//input[@id=\"ConfirmPassword\"]")

	WebElement conpasswd;

	 // Locating the 'Register' button for confirmation

	@FindBy(xpath="//input[@id=\"register-button\"]")

	WebElement Confirmregister;

	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	// Method to perform the registration

    // It clicks on the 'Register' link, selects 'Gender', fills in details, and confirms registration

	public Register1Page register(String firstName, String lastName, String Email, String password, String confirmPassword) {

		register.click();

		gender.click();

		name.sendKeys(firstName);

		lastname.sendKeys(lastName);

		email.sendKeys(Email);

		passwd.sendKeys(password);

		conpasswd.sendKeys(confirmPassword);

		Confirmregister.click();

		// Returning an instance of Register1Page

		return new Register1Page(BaseClass.driver);

	}

}
