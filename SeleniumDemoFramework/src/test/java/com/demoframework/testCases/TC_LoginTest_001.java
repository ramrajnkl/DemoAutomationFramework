package com.demoframework.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoframewrk.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		
		logger.info("URL is Opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered UserName");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
		
		
	}

}
