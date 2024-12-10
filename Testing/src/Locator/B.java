package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  
		  driver.manage().window().maximize();
		  
		//Absolute XPath
		  
		  driver.findElement(By.xpath("/html/body/form/div[1]/input[1]")).sendKeys("Admin");
		  driver.findElement(By.xpath("/html/body/form/div[1]/input[2]")).sendKeys("admin");
		  WebElement w =driver.findElement(By.xpath("/html/body/form/div[1]/select"));
		  Select s=new Select(w);
		  s.selectByIndex(2);
		  
		  
		  
		  

	}

}
