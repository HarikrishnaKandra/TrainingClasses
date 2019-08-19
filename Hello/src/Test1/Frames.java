package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{

public static void main(String[] args) 
{
	//Chrome Browser 
	System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
		
	// Webdriver is an Interface 
	// Creating  an object for Chromedriver() class and assigning object to WebDriver interface
    WebDriver driver = new ChromeDriver();	
		
   // get() this method loads a new webpage in the current browser window.
   driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.129831500.177220696.1565531425-1242365565.1565531425");	
   //
   driver.manage().window().maximize();
   //
   driver.switchTo().frame("login_page");
   
   driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
   
   driver.switchTo().defaultContent();
	    	

}

}
