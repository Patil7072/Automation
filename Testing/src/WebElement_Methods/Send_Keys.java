package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Send_Keys {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //WebElement_Methods:
		  // 1) Send Keys() :
		  
		  
		  driver.findElement(By.cssSelector("div input:nth-of-type(1)")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("div input:nth-of-type(2)")).sendKeys("admin123");
		  WebElement e= driver.findElement(By.cssSelector("div select:nth-of-type(1)"));
		  Select s= new Select(e);
		  s.selectByIndex(1);
		  
		  // 2)Click() :
		  driver.findElement(By.cssSelector("div button:nth-of-type(1)")).click();

	}

}
