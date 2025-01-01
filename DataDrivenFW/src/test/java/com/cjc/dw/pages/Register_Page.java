package com.cjc.dw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register_Page {
	
	WebDriver driver;
	
	
	@FindBy(name = "Gender")
	WebElement gen;
	
	@FindBy(name = "FirstName")
	WebElement Fname;
	
	@FindBy(name = "LastName")
	WebElement Lname;
	
	@FindBy(name = "Email")
	WebElement Mail;
	
	@FindBy(name = "Password")
	WebElement Ps;
	
	@FindBy(name = "ConfirmPassword")
	WebElement Cps;
	
	@FindBy(name = "register-button")
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	
	public void reg(String fname,String lname,String mail,String ps,String cps)
	{
		gen.click();
		Fname.sendKeys(fname);
		Lname.sendKeys(lname);
		Mail.sendKeys(mail);
		Ps.sendKeys(ps);
		Cps.sendKeys(cps);
		submit.click();
		logout.click();
	}
	
	

}
