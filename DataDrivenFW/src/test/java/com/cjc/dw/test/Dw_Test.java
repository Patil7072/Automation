package com.cjc.dw.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cjc.dw.Utility.common;
import com.cjc.dw.pages.Address;
import com.cjc.dw.pages.Cart;
import com.cjc.dw.pages.CheckOut;
import com.cjc.dw.pages.Login_Page;
import com.cjc.dw.pages.Register_Page;





public class Dw_Test {
	Properties pro=new Properties();
	static Logger log=Logger.getLogger(Dw_Test.class.getName());

	
	@BeforeSuite
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Class\\Programs\\Jar's & Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 common.driver=new ChromeDriver();
		 FileInputStream fr= new FileInputStream("src//test//resources//address.properties");
		 pro.load(fr);
	
	}
	
	@BeforeTest
	public void geturl()
	{
		common.driver.get("https://demowebshop.tricentis.com/register");
	}
	
	@BeforeClass
	public void manage()
	{
		common.driver.manage().window().maximize();
	}
	
	@BeforeMethod	
	public void m1()
	{
		log.debug("Before Method");
	}
	
	//Register :
	@Test(priority = 1,dataProvider = "getData")
	public void Register(String fname,String lname,String mail,String ps,String cps) throws IOException, InterruptedException
	{	
		Register_Page rp=PageFactory.initElements(common.driver, Register_Page.class);
		rp.reg(fname, lname, mail, ps, cps);
	}
	
	//Login :
	@Test(priority = 2)
	public void Login() throws IOException
	{
		common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Login_Page lp=PageFactory.initElements(common.driver, Login_Page.class);
		lp.log("spl432@0gmail.com", "321654");
	}
	
	//Add To Cart :
	@Test(priority = 3)
	public void cart()
	{
		common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Cart c=PageFactory.initElements(common.driver, Cart.class);
		c.crt();
	}
	
	//Address :
	@Test(priority = 4)
	public void address() throws IOException
	{
	
		common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Address ad=PageFactory.initElements(common.driver, Address.class);
		ad.address();
	}
	
	//CheckOut :
	@Test(priority = 5)
	public void cout() throws InterruptedException
	{
		common.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		CheckOut co=PageFactory.initElements(common.driver, CheckOut.class);
		co.out();
		
			
	}
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
			new Object[] {"sahil","Patil","spl432@0gmail.com","321654","321654"}
				};
	}
	

		
		
}

