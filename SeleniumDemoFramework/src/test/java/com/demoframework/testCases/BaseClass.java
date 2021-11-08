package com.demoframework.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="http://demo.guru99.com/Agile_Project/Agi_V1/";
	public String username = "mngr366098";
	public String password = "Aguhame";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{	
		System.setProperty("webdriver.chrome.driver",
				 System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
			
	
	

}
