package Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		//Fluent Wait :
		Wait<WebDriver> wdw=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(12))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement w=wdw.until(new Function<WebDriver,WebElement>() {
			
			public WebElement apply(WebDriver t) {
				WebElement we=driver.findElement(By.id("demo"));
				System.out.println("Fluent-Wait");
				String msgvalue=we.getText();
				if(msgvalue.equalsIgnoreCase("Software Testing Material - DEMO PAGE"))
				{
					System.out.println("If condition");
					return we;
				}
				else {
					return null;
				}
			}
		});

	}

}
	