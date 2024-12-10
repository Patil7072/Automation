package Selelium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A
{
  public static void main(String[] args) throws InterruptedException
  {
	
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  //get method:
	  driver.get("https://www.google.co.in/");
	  
	  //get current url:
	  String u=driver.getCurrentUrl();
	  System.out.println(u);
	  
	  
	 //Get Title:
	  
	 String t=driver.getTitle();
	 System.out.println(t);
	  
	 
	 //Get page source:
	 String ps=driver.getPageSource();
	 System.out.println(ps);
	 
	 //Manage:
	 driver.manage().window().maximize();
	 
	 
	 //Navigate:
	 driver.navigate().to("https://www.facebook.com/login/");
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 
	 //Close:
	 driver.close();
}
}
