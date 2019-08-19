package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigattions 
{

public static void main(String[] args) 
{
	//Chrome Browser 
	System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
			
	// Webdriver is an Interface 
    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
	WebDriver driver = new ChromeDriver();	
			
	// get() this method loads a new webpage in the current browser window.
    driver.get("https://www.gmail.com");	
		    
    //Maximize the Browser
	driver.manage().window().maximize();
	
	//This method allows the driver to access the browser's history and to navigate to given URl.
	//This method returns "Webdriver.navigation" interface and this interface has following methods
	//To() Load a new webpage in the current browser window
	driver.navigate().to("http://www.facebook.com");
	//Moves back a single "item" in the browser's history
	driver.navigate().back();
	//Refresh th current page
	driver.navigate().refresh();
	//Moves a single "item" forward in the brwser's history
	driver.navigate().forward();
}

}
