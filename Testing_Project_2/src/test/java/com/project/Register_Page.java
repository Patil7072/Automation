package com.project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Page 
{
	WebDriver driver;
	Properties pro=new Properties();

	
	By gen = By.xpath("//*[@id=\"gender-male\"]");
	By fname= By.xpath("//*[@id=\"FirstName\"]");
	By lname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By ps=By.xpath("//*[@id=\"Password\"]");
	By cps =By.xpath("//*[@id=\"ConfirmPassword\"]");
	By submit = By.xpath("//*[@id=\"register-button\"]");
	By logout =By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By login = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	
	public Register_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void reg() throws IOException
	{
		
		FileInputStream fs= new FileInputStream("D:\\Testing_Class\\Programs\\Praticee\\Reg.properties");
		pro.load(fs);
		
		driver.findElement(gen).click();
		driver.findElement(fname).sendKeys(pro.getProperty("fname"));
		driver.findElement(lname).sendKeys(pro.getProperty("lname"));
		driver.findElement(email).sendKeys(pro.getProperty("email"));
		driver.findElement(ps).sendKeys(pro.getProperty("ps"));
		driver.findElement(cps).sendKeys(pro.getProperty("confps"));
		driver.findElement(submit).click();
		driver.findElement(logout).click();
		driver.findElement(login).click();
	}

}
