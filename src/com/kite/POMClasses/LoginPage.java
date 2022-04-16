package com.kite.POMClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
private WebDriver driver;
	
	@FindBy(id="userid")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void setuserid()
	{
		userid.sendKeys("AIV969");
	}
	public void setpassword()
	{
		password.sendKeys("@kash1996");
	}
	public void setlogin()
	{
		login.click();
	}


}
