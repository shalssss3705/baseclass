package com.demowebshop.base;
//Import statements for necessary classes and annotations
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.demowebshop.page.CheckboxPage;
import com.demowebshop.page.ConfirmPage;
import com.demowebshop.page.HomePage;
import com.demowebshop.page.PamentInfoPage;
import com.demowebshop.page.PaymentPage;
import com.demowebshop.page.Register1Page;
import com.demowebshop.page.RegisterPage;
import com.demowebshop.page.ShippingAddressPage;
import com.demowebshop.page.ShoppingPage;
import com.demowebshop.page.ThankyouPage;
 
 
//created the base class
public class BaseClass {
	public static WebDriver driver;
	public static RegisterPage registerPage;
	public static Register1Page register1Page;
	public static HomePage homePage;
	public static ShoppingPage shoppingPage;
	public static CheckboxPage checkboxPage;
	public static ShippingAddressPage shippingAddressPage;
	public static PaymentPage paymentPage;
	public static PamentInfoPage pamentInfoPage;
	public static ConfirmPage confirmPage;
	public static ThankyouPage thankyouPage;
	public static ExtentReports extent;
    public static  ExtentTest test;

	// Method to be executed before the test suite starts
   
	@BeforeSuite
	public void setUp() {
		
		
		
		// Setting up the system property for the ChromeDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mubeen khan\\eclipse-workspace\\web_automation_shalini_group\\drivers\\chromedriver.exe");
		 // Creating a new instance of the ChromeDriver
		driver = new ChromeDriver();
		// Maximizing the browser window
		driver.manage().window().maximize();
		 // Navigating to the specified UR
		driver.get("https://demowebshop.tricentis.com/");
		// Setting an implicit wait to wait for elements to be present before throwing an exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Initializing the RegisterPage using the WebDriver instance
		registerPage = new RegisterPage(driver);
		ExtentSparkReporter spark = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();         
        extent.attachReporter(spark);
        
        
        
        registerPage= new RegisterPage(driver);
       register1Page= new Register1Page(driver);
        
        homePage= new HomePage(driver);
        shoppingPage= new ShoppingPage(driver);
        checkboxPage= new CheckboxPage(driver);
        shippingAddressPage= new ShippingAddressPage(driver);
        paymentPage= new PaymentPage(driver);
        
        pamentInfoPage= new PamentInfoPage(driver);
        
        confirmPage= new ConfirmPage(driver);
        
        
        thankyouPage= new ThankyouPage(driver);
        
        
        
        
        
        
        
        
        
        
        
		}
		

	
	 // Method to be executed after the test suite finishes
	@AfterSuite
	public void tearDown() {
		//quitting the driver
		driver.quit();
	}
}
 
