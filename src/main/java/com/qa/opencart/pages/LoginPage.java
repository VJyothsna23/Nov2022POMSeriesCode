package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	// private By locators: We are making these Page Locators private to restrict the access by other classes. This is to ensure that no one else will change their values.
	private By email = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbtn = By.xpath("//input[@value='Login']");
	private By forgotPwdLink = By.linkText("Forgotten Password");
	
	// Page Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// 3. Page Actions/methods: These will be made public so that other classes can use these methods.
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		System.out.println("Login page title is:"+ title);
		return title;
	}
	
	public String getLoginPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Login page title is:"+ url);
		return url;
	}
	
	public boolean isForgotPwdLinkExist() { // Here we are using private class variable inside public method. This is the Encapsulation concept of Java.
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void doLogin(String un, String pwd) {
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();
	}
	
	

}
