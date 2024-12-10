package Web_Table;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Demo {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("file:///D:/Testing_Class/Programs/Praticee/table.html");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 //Rows Count :
		 List<WebElement> rowlist=driver.findElements(By.tagName("tr"));
		 int rcount=rowlist.size();
		 System.out.println("Number of Rows : "+rcount);
		 
		 //Column Count : 
		 List<WebElement> clist=driver.findElements(By.tagName("td"));
		 int ccount=clist.size();
		 System.out.println("Number of Columns : "+ccount);
		 
		 
		 //Display Table &  Row Data :
		 for(WebElement row:rowlist)
		 {
			 List<WebElement> cls=row.findElements(By.tagName("td"));
			 
			 for(WebElement co:cls)
			 {
				 System.out.println(co.getText());
			 }
		 }
		 
		 //Display Single Row Data :
		 System.out.println("=============================================");
		 WebElement data=driver.findElement(By.xpath("/html/body/table/tbody/tr[5]"));
		 System.out.println(data.getText());
		 

	}

}
