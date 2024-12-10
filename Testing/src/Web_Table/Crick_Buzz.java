package Web_Table;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crick_Buzz {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-20");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 
		 //Table :
		 WebElement inning1=driver.findElement(By.xpath("//*[@id=\"innings_1\"]"));
		 
		 
		 
		 //Total No of Rows :
		 List<WebElement> rows=inning1.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] "));
		 int rcount=rows.size();
		 System.out.println(rcount);
		 
		 //Total No of Column :
		 List<WebElement> column=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']"));
		 int ccount=column.size();
		 System.out.println(ccount);
		 
		 //Runs Calculation : 
		 int sum=0;
		 
		 for (int i = 0; i < rcount-2; i++) 
		 {
			 String value=inning1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			 int runvalue=Integer.parseInt(value);
			 sum=sum+runvalue;
			
		}
		 System.out.println(sum);
		 
		 

	}

}
