package com.Demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fb_index {
	WebDriver driver;
	Properties pro=new Properties();
	
	
	@BeforeSuite
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 FileInputStream fir = new FileInputStream("D:\\Testing_Class\\Programs\\Praticee\\fb_index.properties");
		 pro.load(fir);
	}
	
	@BeforeTest
 	public void geturl()
 	{
 		driver.get(pro.getProperty("url"));
 	}
 	
 	@BeforeClass
 	public void m1()
 	{
 		driver.manage().window().maximize();
 	}
 	
 	@BeforeMethod
 	public void m2()
 	{
 		System.out.println("Before Method");
 	}
 	
 	@Test
 	public void login()
 	{
 		driver.findElement(By.name("email")).sendKeys(pro.getProperty("un"));
 		driver.findElement(By.name("pass")).sendKeys(pro.getProperty("ps"));
 		driver.findElement(By.name("login")).click();
 	}
	
	

}
