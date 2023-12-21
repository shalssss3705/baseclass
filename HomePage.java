package com.demowebshop.page;

//Importing necessary WebDriver and WebElement classes

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
 
import com.demowebshop.base.BaseClass;

//HomePage class is created

public class HomePage {

	WebDriver driver;

//Locating the 'Books' menu item

@FindBy(xpath="(//div[@class=\"top-menu-triangle\"]/preceding-sibling::a[@href=\"/books\"])[1]")

WebElement book;
 
// Locating the 'Add to Cart' button for a specific product

@FindBy(xpath="//div[@class='details']/h2/a[text()='Computing and Internet']/parent::h2/following-sibling::*/div/input")

WebElement addtocart;
 
//Constructor initializing PageFactory and WebElement instances

public HomePage(WebDriver driver) {

	PageFactory.initElements(driver, this);

}
 
//Method to navigate to the Books section, select a product, and add it to the cart

// It clicks on the 'Books' menu item and then clicks on the 'Add to Cart' button

// It returns an instance of ShoppingPage, representing the shopping page

public ShoppingPage books()  {

	book.click();
 
	addtocart.click();

	return new ShoppingPage(BaseClass.driver);

}

}
