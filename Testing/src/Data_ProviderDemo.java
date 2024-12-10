import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Test_Ng.Listner_Demo;


@Listeners(Listner_Demo.class)
public class Data_ProviderDemo 
{
	
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
		driver.get("https://demowebshop.tricentis.com/register");
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
	
	@Test(dataProvider = "getData")
	public void login(String uname, String lname, String enam, String pass, String cpass) throws InterruptedException
	{
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys(uname);
		driver.findElement(By.name("LastName")).sendKeys(lname);
		driver.findElement(By.name("Email")).sendKeys(enam);
		driver.findElement(By.name("Password")).sendKeys(pass);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(cpass);
		driver.findElement(By.cssSelector("#register-button")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.name("FirstName")).clear();
		driver.findElement(By.name("LastName")).clear();
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("ConfirmPassword")).clear();
		
	}
	@AfterMethod
	public void m1()
	{
		
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
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]
				{
			new Object[] {"AAA", "aaa", "cjcjava92@gmail.com", "Cjc@123", "Cjc@123"},
			new Object[] {"BBB", "bbb", "sacjc1@gmail.com", "Cjc@123", "Cjc@123"},
			new Object[] {"CCC", "ccc", "amit90@gmail.com", "Cjc@123", "Cjc@123"}
				};
	}

}
