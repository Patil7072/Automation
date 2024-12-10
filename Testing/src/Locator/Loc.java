package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
       
		  //ID:
		  WebElement us =driver.findElement(By.id("email"));
		  us.sendKeys("Abc@123");
		  
		  //Name:
		  driver.findElement(By.name("pass")).sendKeys("1234");
		  Thread.sleep(2000);
		  //Class Name:
		  //driver.findElement(By.className("loginbutton")).click();
		  
		  //Link Text:
		  driver.findElement(By.linkText("Forgotten account?")).click();
		  
		  
	}

}
