package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;


public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void LoginTest() {
	driver.get(baseURL);
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	if(driver.getTitle().equals("Guru99 Bank Manager Homepage")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertFalse(false);
	}
	}

}
