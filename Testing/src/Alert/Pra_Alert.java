package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra_Alert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		//Accept :
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(5000);
		//Dismiss :
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		//Accept :
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//SendKeys :
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		driver.switchTo().alert().sendKeys("Admin");
		//Accept :
		driver.switchTo().alert().accept();
		

	}

}
