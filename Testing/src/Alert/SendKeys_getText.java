package Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_getText
{
    public static void main(String[] args) throws InterruptedException 
    {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
	//Alert: SendKeys:
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("CJC");
		//Alert: getText:
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		
		driver.switchTo().alert().accept();
	}
}
