package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sibling_Child {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  //Dynamic 
		  
		  //XPath Dynamic Parent:
		  
		  WebElement e= driver.findElement(By.xpath("//option[1]/parent ::select"));
		  Select s=new Select(e);
		  s.selectByIndex(1);
		  
		  
		  //XPath Dynamic Child:
		  driver.findElement(By.xpath("//div/child ::input[1]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//div/child ::input[2]")).sendKeys("admin@123");
		

	}


	

}
