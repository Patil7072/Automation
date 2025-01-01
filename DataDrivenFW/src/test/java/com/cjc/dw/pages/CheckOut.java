package com.cjc.dw.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
	WebElement add;
	
	@FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
	WebElement ship;
	
	@FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement shipMethod;
	
	@FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement Payment;
	
	@FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement payinfo;
	
	@FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement corder;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	WebElement TK;
	
	
	public CheckOut(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void out() throws InterruptedException
	{
		add.click();
		Thread.sleep(2000);
		ship.click();
		Thread.sleep(2000);
		shipMethod.click();
		Thread.sleep(2000);
		Payment.click();
		Thread.sleep(2000);
		payinfo.click();
		Thread.sleep(2000);
		corder.click();
		Thread.sleep(2000);
		TK.click();
	}
	

}
