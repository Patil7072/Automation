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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Xml_ex {
WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 driver=new ChromeDriver();
	}
	
	@BeforeTest
	public void entrurl()
	{
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void getcookies()
	{
		Set<Cookie> cookies=driver.manage().getCookies();
		for (Cookie cookie : cookies)
		{
			System.out.println(cookie.getName());
		}
	}
	
	@Test
	@Parameters({"uname","pass"})
	public void login(String un, String pass)
	{
		driver.findElement(By.name("userName")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	}
	
	
	@AfterClass
	public void deletecookie()
	{
		driver.manage().deleteAllCookies();;
	}
	
	@AfterTest
	public void connectiom()
	{
		System.out.println("DB Closed");
	}
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}

}
