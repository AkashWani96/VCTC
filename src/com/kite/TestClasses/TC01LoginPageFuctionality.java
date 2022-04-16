package com.kite.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.kite.POMClasses.LoginPage;

public class TC01LoginPageFuctionality 
{
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\Automation Testing\\04. Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("1. Open the browser");
		
		driver.manage().window().maximize();
		System.out.println("2. Maximize the browser");
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("3.open the URL");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		LoginPage lp = new LoginPage(driver);
		lp.setuserid();
		System.out.println("4. userid entered");
		lp.setpassword();
		System.out.println("5. password entered");
		lp.setlogin();
		System.out.println("6.click on login button");
		
		
	}
}
