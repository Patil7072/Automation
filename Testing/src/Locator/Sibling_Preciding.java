package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sibling_Preciding {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //Preceding Sibling :
		  
		  driver.findElement(By.xpath("//select/preceding-sibling ::input[2]")).sendKeys("User");
		  driver.findElement(By.xpath("//select/preceding-sibling ::input[1]")).sendKeys("user123");
		  WebElement e= driver.findElement(By.xpath("//button[1]/preceding-sibling ::select"));
		  Select s=new Select(e);
		  s.selectByIndex(2);
		  
		  //Following Preceding :
		  
		  driver.findElement(By.xpath("//select/following-sibling ::button")).click();

	}

}
