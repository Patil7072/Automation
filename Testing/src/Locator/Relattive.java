package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relattive {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //Relative XPath:
		  
		  
		  driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("Admin");
		  driver.findElement(By.xpath("//input[@id='pid']")).sendKeys("admin@123");
		  WebElement w=driver.findElement(By.xpath("//select[@id='browser']"));
		  Select s=new Select(w);
		  s.selectByIndex(2);
		  driver.findElement(By.xpath("//button[@id='login']")).click();

	}


	

}
