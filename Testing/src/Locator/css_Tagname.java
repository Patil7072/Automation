package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class css_Tagname {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : TagName & ClassValue :
		  
		  driver.findElement(By.cssSelector("input.username")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("input.pass")).sendKeys("admin@123");
		  WebElement e= driver.findElement(By.cssSelector("select#browser"));
		  Select s= new Select(e);
		  s.selectByIndex(1);
		  Thread.sleep(200);
		  driver.findElement(By.cssSelector("button.login")).click();

	}

}
