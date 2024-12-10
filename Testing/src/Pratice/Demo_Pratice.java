package Pratice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Pratice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		 driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("datepicker1")).click();
		 //Date Picker :
		 while (!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("February"))
		 {
			 System.out.println("While loop");
			 driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		 
		 List<WebElement> list=driver.findElements(By.cssSelector("[class='ui-state-default']"));
		 int count = list.size();
		 System.out.println(count);
		 
		 for (int i = 0; i < count; i++) 
		 {
			 String dayv=driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();
			 if(dayv.equalsIgnoreCase("14"))
			 {
				 driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
			 }
			
		}
		
		}
		 

	}


