package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Immeadite_Sibling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //Immediate Preceding Sibling :
		  
		  driver.findElement(By.xpath("//select/preceding-sibling ::*[7]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//select/preceding-sibling ::*[3]")).sendKeys("admin123");
		  WebElement e= driver.findElement(By.xpath("//button/preceding-sibling ::*[4]"));
		  Select s= new Select(e);
		  s.selectByIndex(2);
		  

	}

}
