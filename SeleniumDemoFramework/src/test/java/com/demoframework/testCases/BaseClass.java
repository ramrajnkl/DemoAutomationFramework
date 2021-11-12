package com.demoframework.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.demoframework.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
			
	public static WebDriver driver;
	public  static Logger logger;
	
	@BeforeClass
	public void setup()
	{	
		
		System.setProperty("webdriver.chrome.driver",  readconfig.getchromepath());
		driver=new ChromeDriver();
		
		logger = Logger.getLogger("SeleniumDemoFramework");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
		
	}
			
	
	

}
