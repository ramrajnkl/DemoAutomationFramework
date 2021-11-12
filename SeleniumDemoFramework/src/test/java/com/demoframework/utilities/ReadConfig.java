package com.demoframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception is " + ex.getMessage());
		}
		
		
	}
	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL"); 
		return url;
	}
	
	public String getusername()
	{
		String username = pro.getProperty("username"); 
		return username;
	}
	
	public String getpassword()
	{
		String password = pro.getProperty("password"); 
		return password;
	}
	
	public String getchromepath()
	{
		String chromepath = pro.getProperty("chromepath"); 
		return chromepath;
	}
	
	public String getiepath()
	{
		String iepath = pro.getProperty("iepath"); 
		return iepath;
	}
	
	public String getfirefoxpath()
	{
		String firefoxpath = pro.getProperty("firefoxpath"); 
		return firefoxpath;
	}

}
