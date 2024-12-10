package Test_Ng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_Index 
{
	WebDriver driver;
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void enterurl()
	{
		driver.get("D:\\Testing_Class\\Programs\\Praticee\\index (1).html");
	}
	
	@BeforeClass
	public void windowmax()
	{
		driver.manage().window().maximize();
	}
	
//	@BeforeMethod
//	public void getcookies()
//	{
//		Set<Cookie> cookies=driver.manage().getCookies();
//		for(Cookie cookie : cookies)
//		{
//			System.out.println(cookie.getName());
//		}
//				
//	}
	
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("uname")).sendKeys("Admin");
		driver.findElement(By.name("pass")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
	}
	
//	@AfterClass
//	public void deletecookie()
//	{
//		driver.manage().deleteAllCookies();
//	}
	
	@AfterTest
		public void conneection()
		{
			System.out.println("DB Closed");
		}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	

}
