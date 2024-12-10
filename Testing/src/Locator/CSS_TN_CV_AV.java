package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TN_CV_AV {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : TagName, ClassValue, & Attribute Value :
		  
		  driver.findElement(By.cssSelector("input.username[id='uid']")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("input.pass[id=pid]")).sendKeys("admin123");
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button.login[id='login']")).click();

	}

}
