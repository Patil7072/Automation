package com.cjc.dw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.cjc.dw.Utility.common;

public class Cart {
	
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
	WebElement a;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement b;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button-13\"]")
	WebElement c;
	
	@FindBy(xpath = "//*[@id=\"topcartlink\"]/a/span[1]")
	WebElement d;
	
	@FindBy(xpath = "//*[@id=\"ZipPostalCode\"]")
	WebElement f;
	
	@FindBy(xpath = "//*[@id=\"termsofservice\"]")
	WebElement g;
	
	@FindBy(xpath = "//*[@id=\"checkout\"]")
	WebElement h;
	
	public Cart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void crt()
	{
		a.click();
		b.click();
		c.click();
		d.click();
		
		WebElement w= common.driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
		Select s=new Select(w);
		s.selectByIndex(98);
		
		f.sendKeys("4411");
		g.click();
		h.click();
	}

}
