package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/login/");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@123");
		  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		  

	}

}
