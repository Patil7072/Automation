package WebElement_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElement_Wait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  
		  //WebElement Wait():
		  
		  //PageLoad TimeOut:
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  
		  driver.findElement(By.linkText("Forgotten password?")).click();
		  
		  //Implicit Wait :
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.navigate().back();
		  
		  //Explicit Wait :
		  
		  
		  
		  

	}

}
