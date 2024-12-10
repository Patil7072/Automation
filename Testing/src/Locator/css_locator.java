package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class css_locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("D:\\Testing_Class\\index (1).html");
		  driver.manage().window().maximize();
		  
		  //CSS Selector : TagName & ID Value:
		  
		  driver.findElement(By.cssSelector("input#uid")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("input#pid")).sendKeys("Admin123");
		  WebElement e= driver.findElement(By.cssSelector("select#browser"));
		  Select s =new Select(e);
		  s.selectByIndex(2);
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("button#login")).click();

	}

}
