package Cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coolies_Methods {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 
		 //Cookies :
		 Set<Cookie> cookies=driver.manage().getCookies();
		 int cs=cookies.size();
		 
		 System.out.println("Cookies Size : "+cs);
		 
		 //Cookies Methods :
		 
		 for (Cookie cookie : cookies)
		 {
			 System.out.println("Name of Cookie : "+cookie.getName());            //getetName
			 System.out.println("Name of Domain : "+cookie.getDomain());          //getDomain
			 System.out.println("Name of Class : "+cookie.getClass());            //getClass
			 System.out.println("Cookie Value : "+cookie.getValue());             //getValue
			 System.out.println("Cookie Path : "+cookie.getPath());               //getPath
			 System.out.println("Cookie Expiry : "+cookie.getExpiry());           //getExpiry
			 System.out.println("Cookie Http : "+cookie.isHttpOnly());            //isHttpOnly
			 System.out.println("Cookie is Secure : "+cookie.isSecure());         //isSecure
			 
			 System.out.println("=======================================");
		 }
		 
		 driver.manage().deleteCookieNamed("i18n-prefs");                        //Delete Cookie
		 Set<Cookie> cookies1=driver.manage().getCookies();
		 int cs1=cookies.size();
		 
		 System.out.println(cs1);

	}

}
