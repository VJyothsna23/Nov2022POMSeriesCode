package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest{
			
	@Test
	public void loginPageTitleTest() {
		 String title = loginPage.getLoginPageTitle();
		 Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void loginPageUrlTest() {
		 String url = loginPage.getLoginPageUrl();
		 Assert.assertTrue(url.contains("route=account/login"));
	}
	
	@Test
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	@Test
	public void loginTest() {
		loginPage.doLogin("Jyothsna", "test123");
	}
	
			

}
 