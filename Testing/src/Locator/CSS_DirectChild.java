package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSS_DirectChild {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : Direct Child 
		  
		  driver.findElement(By.cssSelector("div>input#uid")).sendKeys("admin");
		  driver.findElement(By.cssSelector("div>input#pid")).sendKeys("admin123");
		  WebElement e= driver.findElement(By.cssSelector("div>select#browser"));
		  Select s= new Select(e);
		  s.selectByIndex(1);
		  driver.findElement(By.cssSelector("div>button#login")).click();

	}

}
