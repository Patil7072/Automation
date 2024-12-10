package Pratice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_New {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Datepicker.html");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("datepicker1")).click();

		 
		 while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-month']")).getText().contains("August"))
		 {
			 System.out.println("While Loop");
			 driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-icon ui-icon-circle-triangle-w']")).click();
		 }
		 
		 List<WebElement> list=driver.findElements(By.cssSelector("[class='ui-state-default']"));
		 int d=list.size();
		 System.out.println(d);
		 
		 
		 for (int i = 0; i < d; i++) 
		 {
		     String dayvalue= driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();
		     
		     if(dayvalue.equalsIgnoreCase("15"))
		     {
		    	 driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
		     }
		}
	}
}
