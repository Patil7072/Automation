package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class immediate_Following {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //Immediate Following Sibling :
		  
		  driver.findElement(By.xpath("//label/following-sibling :: *[1]")).sendKeys("Admin");
		  driver.findElement(By.xpath("//label/following-sibling :: *[5]")).sendKeys("admin123");
		  WebElement e= driver.findElement(By.xpath("//label/following-sibling :: *[8]"));
		  Select s=new Select(e);
		  s.selectByIndex(2);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//label/following-sibling :: *[12]")).click();

	}

}
