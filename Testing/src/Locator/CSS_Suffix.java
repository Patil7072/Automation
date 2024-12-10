package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_Suffix {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : Match with SubString : Suffix :
		  
		  
		  driver.findElement(By.cssSelector("input[id$='uid']")).sendKeys("admin");
		  driver.findElement(By.cssSelector("input[id$='pid']")).sendKeys("admin123");
		  WebElement e = driver.findElement(By.cssSelector("select[id$='browser']"));
		  Select s= new Select(e);
		  s.selectByIndex(1);
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button[id$='login']")).click();

	}

}
