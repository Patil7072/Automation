package com.cjc.dw.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.dw.Utility.common;

public class Address {
	
	WebDriver driver;
	Properties pro=new Properties();
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_City\"]")
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address1\"]")
	WebElement add1;
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_Address2\"]")
	WebElement add2;
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement zip;
	
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_PhoneNumber\"]")
	WebElement phn;
	
	
	public Address(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void address() throws IOException
	{
		FileInputStream fr= new FileInputStream("src//test//resources//address.properties");
		 pro.load(fr);
		 
		WebElement a= common.driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
		Select s=new Select(a);
		s.selectByIndex(98);
		
		city.sendKeys(pro.getProperty("city"));
		add1.sendKeys(pro.getProperty("add1"));
		add2.sendKeys(pro.getProperty("add2"));
		zip.sendKeys(pro.getProperty("zip"));
		phn.sendKeys(pro.getProperty("ph"));
	}
	
	

}
