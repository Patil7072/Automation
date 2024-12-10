package Web_Table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inning_Two {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-20");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 //Table Inning 2:
		 WebElement inning2=driver.findElement(By.xpath("//*[@id=\"innings_2\"]"));
		 
		 
		 //Total Rows :
		 List<WebElement> rows=inning2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		 int rcount=rows.size();
		 System.out.println("Total Rows : "+rcount);
		 
		
		 //Total Column :
		 List<WebElement> column=driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-sub-hdr cb-bg-gray']"));
		 int ccount=column.size();
		 System.out.println("Total Column : "+ccount);
		 
		 
		 //Run calculation :
		 int sum=0;
		 
		 for (int i=0;i<rcount-3;i++)
		 {
			 String value=inning2.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
			 int runvalue=Integer.parseInt(value);
			 sum=sum+runvalue;
			
		}
		 System.out.println("Total Runs : "+sum);
	}

}
