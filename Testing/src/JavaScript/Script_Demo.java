package JavaScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("scrollBy(0,200)");
		 
		 //From To Go :
		 WebElement from=driver.findElement(By.id("fromPlaceName"));
		 from.sendKeys("VIJ");
		 
		 
		 String cname="return document.getElementById(\"fromPlaceName\").value;";
		 String cvalue = (String)js.executeScript(cname);
		 
		 System.out.println("City Value"+cvalue);
		 
		 while (!cvalue.equalsIgnoreCase("VIJAYRAI"))
		 {
			 from.sendKeys(Keys.DOWN);
			 Thread.sleep(2000);
			 cname="return document.getElementById(\"fromPlaceName\").value;";
			 cvalue=(String)js.executeScript(cname);
			 System.out.println(cvalue);
			
		}
		 from.sendKeys(Keys.ENTER);
		 
		 
		 //TO GO :
		 WebElement to=driver.findElement(By.id("toPlaceName"));
		 to.sendKeys("HYD");
		 
		 String tname="return document.getElementById(\"toPlaceName\").value;";
		 String tvalue =(String)js.executeScript(tname);
		 
		 System.out.println("City Value "+tvalue);
		 
		 while (!tvalue.equalsIgnoreCase("HYDERABAD-AIRPORT-RGIA-PICKUP POINT-D-VJA"))
		 {
			 
			to.sendKeys(Keys.DOWN);
			Thread.sleep(2000);
			tname="return document.getElementById(\"toPlaceName\").value;";
			tvalue=(String)js.executeScript(tname);
			System.out.println(tvalue);
			
		}
		 to.sendKeys(Keys.ENTER);
		 
		 
		 
		 
	}
}
