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

public class LinkedIn {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.linkedin.com/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 
		 //Total HyperLink :
		 List<WebElement> tlist=driver.findElements(By.tagName("a"));
		 int tcount= tlist.size();
		 System.out.println(tcount);
		 
		 
		 
		 //Footer HyperLinks :
		 WebElement fd=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[11]"));
		 List<WebElement> flist=fd.findElements(By.tagName("a"));
		 int fcount = flist.size();
		 System.out.println(fcount);
		 
		 
		 //Particular Footer Link :
		 WebElement pf=driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[11]/div/div[1]"));
		 List<WebElement> pflist=pf.findElements(By.tagName("a"));
		 int pfcount = pflist.size();
		 System.out.println(pfcount);
		 
		 
		 //Window Handle :
		 for (int i = 0; i < pfcount; i++) 
		 {
		    	System.out.println("For Loop");
		    	String datak=Keys.chord(Keys.CONTROL,Keys.ENTER);
		    	pf.findElements(By.tagName("a")).get(i).sendKeys(datak);
		    	Thread.sleep(2000);
		}
		 
		 Set<String> sk=driver.getWindowHandles();
		 System.out.println(sk);
		 
		 
		 //Window Titles :
		 ArrayList<String> al=new ArrayList<String>(sk);
		 System.out.println(al);
		 
		 
		 //Switch Tabs :
		 Iterator<String> itr=al.iterator();
		 while (itr.hasNext()) {
			driver.switchTo().window(itr.next());
			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
		}

	}

}
