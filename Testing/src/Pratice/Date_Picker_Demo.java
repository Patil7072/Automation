package Pratice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker_Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 	
		 driver.get("https://jqueryui.com/datepicker/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame(0);
		 driver.findElement(By.id("datepicker")).click();
		 
		 
		 //Date Picker : Month :
		 while(!driver.findElement(By.cssSelector("[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']" + "[class='ui-datepicker-month']")).getText().contains("December"));
		 {
		    System.out.println("While Loop");
			 driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']" + "[class='ui-icon ui-icon-circle-triangle-e']")).click();
           
	}
		 
		 List<WebElement> list=driver.findElements(By.cssSelector("[class='ui-state-default']"));
		 
		 int cd=list.size();
		 System.out.println(cd);
		 
		 for (int i = 0; i < cd; i++) 
		 {
		    String dayv = driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).getText();
		    
		    if(dayv.equalsIgnoreCase("25"))
		    {
		    	driver.findElements(By.cssSelector("[class='ui-state-default']")).get(i).click();
		    }
		}
		 
	}
}
