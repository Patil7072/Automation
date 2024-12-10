package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		//Frame In :
		driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		 Thread.sleep(2000);
		 
		 //Frame Out :
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[8]/a")).click();

	}

}
