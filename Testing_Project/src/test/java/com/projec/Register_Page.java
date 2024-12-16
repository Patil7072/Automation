package com.projec;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Register_Page 
{
WebDriver driver;
Properties pro=new Properties();
	
	@FindBy(name ="ico-register")
	WebElement rg;
	
	@FindBy(name="Gender")
	WebElement gender;
	
	@FindBy(name="FirstName")
	WebElement fname;
	
	@FindBy(name="LastName")
	WebElement lname;
	
	@FindBy(name="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement ps;
	
	@FindBy(name="ConfirmPassword")
	WebElement confps;
	
	@FindBy(name="register-button")
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	
	@FindBy(linkText = "Log in")
	WebElement login;
	
	public Register_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void reg() throws IOException
	{
		 FileInputStream fs= new FileInputStream("D:\\Testing_Class\\Programs\\Praticee\\Reg.properties");
			pro.load(fs);
	
		
		
		gender.click();
		fname.sendKeys(pro.getProperty("fname"));
		lname.sendKeys(pro.getProperty("lname"));
		email.sendKeys(pro.getProperty("email"));
		ps.sendKeys(pro.getProperty("ps"));
		confps.sendKeys(pro.getProperty("confps"));
		submit.click();
		logout.click();
		login.click();
	}
	
	
	
	
	
	
	

}
