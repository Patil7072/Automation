package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
	WebDriver driver;
	
	By mail= By.xpath("//*[@id=\"Email\"]");
	By ps =By.xpath("//*[@id=\"Password\"]");
	By remb= By.xpath("//*[@id=\"RememberMe\"]");
	By login= By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void log(String uname, String pss)
	{
		driver.findElement(mail).sendKeys(uname);
		driver.findElement(ps).sendKeys(pss);
		driver.findElement(remb).click();
		driver.findElement(login).click();
	}
	

}
