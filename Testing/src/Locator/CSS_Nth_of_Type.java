package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_Nth_of_Type {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : N th Of Type :
		  
		  
		  driver.findElement(By.cssSelector("div input:nth-of-type(1)")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("div input:nth-of-type(2)")).sendKeys("admin123");
		  WebElement e= driver.findElement(By.cssSelector("div select:nth-of-type(1)"));
		  Select s= new Select(e);
		  s.selectByIndex(2);
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("div button:nth-of-type(1)")).click();

	}

}
