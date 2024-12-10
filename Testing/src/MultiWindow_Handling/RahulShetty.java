package MultiWindow_Handling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShetty 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 //Total HyperLinks :
		 List<WebElement> Totallist = driver.findElements(By.tagName("a"));
		 int Totalcount=Totallist.size();
		 System.out.println(Totalcount);
		 
		 
		 //Footer HyperLink :
		 WebElement fd=driver.findElement(By.id("gf-BIG"));
		 List<WebElement> footerlist= fd.findElements(By.tagName("a"));
		 int footercount=footerlist.size();
		 System.out.println(footercount);
		 
		 
		 //Particular Footer HyperLink :
		 WebElement Parfl=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));
		 List<WebElement> parlist= Parfl.findElements(By.tagName("a"));
		 int partotal=parlist.size();
		 System.out.println(partotal);
		 
		 
		 //Link Click to New Tab :
		 for (int i = 0; i < partotal; i++) 
		 {
		    System.out.println("For Loop");
		    String datak=Keys.chord(Keys.CONTROL,Keys.ENTER);
		    Parfl.findElements(By.tagName("a")).get(i).sendKeys(datak);
		    Thread.sleep(2000);
		}
		 
		 
		 Set<String> sk=driver.getWindowHandles();
		 	System.out.println(sk);
		 	
		 	
		 	ArrayList<String> al= new ArrayList<String>(sk);
		 	
		 	System.out.println(al);
		 	
		 	
		 	Iterator<String> itr=al.iterator();
		 	
		 	while (itr.hasNext()) 
		 	{
				driver.switchTo().window(itr.next());
				String title=driver.getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				
				
				
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}
