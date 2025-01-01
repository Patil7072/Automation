package com.cjc.dw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(name = "Email")
	WebElement uname;
	
	@FindBy(name = "Password")
	WebElement pass;
	
	@FindBy(name = "RememberMe")
	WebElement rem;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement login;
	
	
	public void log(String un,String ps)
	{
		uname.sendKeys(un);
		pass.sendKeys(ps);
		rem.click();
		login.click();
		
	}

}
