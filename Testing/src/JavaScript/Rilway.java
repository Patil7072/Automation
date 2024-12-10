package JavaScript;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rilway {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.railyatri.in/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("scrollBy(0,200)");
		 
		 WebElement from=driver.findElement(By.id("from_stn_input"));
		 from.sendKeys("pune");
		 
		 
		 String cname="return document.getElementById(\"from_stn_input\").value;";
		 
		 String cvalue =(String)js.executeScript(cname);
		 
		 System.out.println("City Value "+cvalue);
		 
		 while(!cvalue.equalsIgnoreCase("PUNE JN | PUNE"))
		 {
			from.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			
			
			cname="return document.getElementById(\"from_stn_input\").value;";
			cvalue=(String)js.executeScript(cname);
			System.out.println(cvalue);
		 }
		 from.sendKeys(Keys.ENTER);		 
		 
		 
		 
		 WebElement to=driver.findElement(By.id("to_stn_input"));
		 to.sendKeys("HYD");
		 
		 String tname="return document.getElementById(\"to_stn_input\").value;";
		 String tvalue =(String)js.executeScript(tname);
		 
		 System.out.println("City Value "+tvalue);
		 
		 while (!tvalue.equalsIgnoreCase("HYDERABAD DECCAN | HYB"))
		 {
			 
			to.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			tname="return document.getElementById(\"to_stn_input\").value;";
			tvalue=(String)js.executeScript(tname);
			System.out.println(tvalue);
			
		}
		 to.sendKeys(Keys.ENTER);
		 
		 

	}

}
