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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider 
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
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	
	@BeforeClass
	public void windowmax()
	{
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void getcookies()
	{
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie cookie : cookies)
		{
			System.out.println(cookie.getName());
		}
				
	}
	
	@Test(dataProvider = "getData")
	public void login(String uname, String pass) throws InterruptedException 
	{
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
		System.out.println("Test Method to check Login");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("password")).clear();
		
		
	}
	
	@AfterClass
	public void deletecookie()
	{
		driver.manage().deleteAllCookies();
	}
	
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
	
	@DataProvider
	public Object[][] getData()
	{
	return new Object[] []
			{
		new Object[] {"QQQQ", "qqq"},
		new Object[] {"AAA", "aaa"},
		new Object[] {"BBB", "bbb"}
			};
	
}
}


