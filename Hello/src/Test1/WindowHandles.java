package Test1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles 
{

public static void main(String[] args) throws InterruptedException 
{
	//Chrome Browser 
	System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
	
	// Webdriver is an Interface 
    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
	WebDriver driver = new ChromeDriver();	
	
	// get() this method loads a new webpage in the current browser window.
    driver.get("https://www.naukri.com");	
    
    //
    driver.manage().window().maximize();
    
   // driver.findElement(By.className("mTxt")).click();
    
    driver.findElement(By.xpath("//div[text()='Recruiters']")).click();
    
    Thread.sleep(5000);
    
    driver.findElement(By.xpath("//div[text()='Companies']")).click();
    
    // GetWindowHandle
    // Returns the current window handle within this driver instance
    ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
    
    Thread.sleep(5000);
    
    driver.switchTo().window(a.get(0));
    
    Thread.sleep(5000);
    
    //ArrayList<String> b = new ArrayList<String>(driver.getWindowHandles());
    
    driver.switchTo().window(a.get(0));
    
    
    
    
    

}

}
