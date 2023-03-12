package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;

public class BaseTest {
	
	DriverFactory df;
	WebDriver driver; // If we don't write anything, it is 'default', it doesn't become 'public' by default.
	protected LoginPage loginPage;
// Here we can also make it public in order to access the 'LoginPage' object in the LoginPageTest class.
//But to restrict the access from other classes, we made it protected. That means now, only the child class of BaseTest class( either from same package or from a different package ) can access it.
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		driver = df.initDriver("Chrome");
		loginPage = new LoginPage(driver);
	}

	@AfterTest
	public void tarDown() {
		driver.quit(); 
	}
}
