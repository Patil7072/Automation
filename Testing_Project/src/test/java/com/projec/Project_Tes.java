package com.projec;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter;

public class Project_Tes 
{
	WebDriver driver;
	Properties pro=new Properties();
	
	@BeforeSuite
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Class\\Programs\\Jar's & Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 FileInputStream fr= new FileInputStream("D:\\Testing_Class\\Programs\\Praticee\\Reg.properties");
		 pro.load(fr);
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
	
	//Register_Page:
	@Test(priority = 1)
	public void reg() throws IOException
	{
		Register_Page rp=PageFactory.initElements(driver, Register_Page.class);
		rp.reg();
	}
	
	
	//Login_Page:
	@Test(priority = 2,dataProvider = "getData")
	public void login(String uname, String ps)
	{
		Login_Page lp=PageFactory.initElements(driver, Login_Page.class);
		lp.login(uname, ps);
		
	}
	
	
	//Add Book to Cart:
	@Test(priority = 3)
	public void book()
	{
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-13\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		
		WebElement w= driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
		Select s=new Select(w);
		s.selectByIndex(98);
		
		driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("415406");
		driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		
	}
	
	
	//Address: 
	@Test(priority = 4)
	@Parameters({"city","add1","add2","zip","ph"})
	public void address(String cty,String ad1,String ad2, String zp, String pno)
	{
		WebElement a= driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]"));
		Select s=new Select(a);
		s.selectByIndex(98);
		
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys(cty);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys(ad1);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys(ad2);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys(zp);
		driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys(pno);
		
		
		
	}
	
	
	//Buy:
	@Test(priority = 5)
	public void checkout() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")).click();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
	return new Object[] []
			{
		new Object[] {"tusharp615@gmail.com", "123456789"}
			};
	}
}
