package com.projec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page 
{
	WebDriver driver;
	
	
	@FindBy(name="Email")
	WebElement mail;
	
	@FindBy(name="Password")
	WebElement pass;
	
	@FindBy(name="RememberMe")
	WebElement remb;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement log;

	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void login(String uname, String ps)
	{
		mail.sendKeys(uname);
		pass.sendKeys(ps);
		remb.click();
		log.click();
		
	}
	
	
	
	
}

   