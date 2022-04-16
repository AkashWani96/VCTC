package com.kite.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwoFactorAuthentication 
{
	private WebDriver driver;
	
	@FindBy(id="pin")
	private WebElement PIN;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continueButton;

    public TwoFactorAuthentication(WebDriver driver)
    {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void sendPin()
	{
    	PIN.sendKeys("211996");
	}
	public void sendcontinueButton()
	{
		continueButton.click();
	}
    
    
    
}