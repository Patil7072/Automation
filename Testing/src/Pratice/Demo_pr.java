package Pratice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_pr {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demoqa.com/date-picker");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 driver.findElement(By.id("datePickerMonthYearInput")).click();
		 
		 
		 while(!driver.findElement(By.cssSelector("[class='react-datepicker-popper'] [class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")).getText().contains("December"))
		 {
			 System.out.println("While Loop");
			 driver.findElement(By.cssSelector("[class='react-datepicker-popper']  [class='react-datepicker__navigation react-datepicker__navigation--next']")).click();
		 }
		 
		 List<WebElement> list=driver.findElements(By.cssSelector("[class='react-datepicker__day react-datepicker__day--001']"));
		 int count=list.size();
		 System.out.println(count);
		 
		 for (int i = 0; i < count; i++) 
		 {
			String dayval=driver.findElements(By.cssSelector("[class='react-datepicker__day react-datepicker__day--001']")).get(i).getText();
			
			if (dayval.equalsIgnoreCase("12"))
			{
				driver.findElements(By.cssSelector("[class='react-datepicker__day react-datepicker__day--001']")).get(i).click();
			}
		}

	}

}
