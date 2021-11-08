package com.demoframewrk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver lDriver;
	
	public LoginPage(WebDriver rDriver){
		lDriver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	public void setUserName(String UserName)
	{
		txtUserName.sendKeys(UserName);
	}
	
	
	public void setPassword(String Password)
	{
		txtPassword.sendKeys(Password);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	
	

}
