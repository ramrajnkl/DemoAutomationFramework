package com.demoframework.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoframewrk.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws IOException {

		try {

			driver.get(baseURL);

			logger.info("URL is Opened");

			LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			logger.info("Entered UserName");

			lp.setPassword(password);
			logger.info("Entered Password");

			lp.clickSubmit();

			if (driver.getTitle().equals("GTPL Bank Manager HomePage1234")) {
				Assert.assertTrue(true);
				logger.info("Login Test Passed");
			} else {
				captureScreen(driver, "loginTest");
				Assert.assertTrue(false);
				logger.info("Login Test failed");
			}
		} 
		catch (Exception ex)
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test failed" + ex.getMessage());
		}

	}

}
