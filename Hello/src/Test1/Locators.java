package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

public static void main(String[] args) 
{
	//Chrome Browser 
	System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
	
	// Webdriver is an Interface 
    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
	WebDriver driver = new ChromeDriver();	
	
	// get() this method loads a new webpage in the current browser window.
    driver.get("http://newtours.demoaut.com/");
    
    //Loactors -->8
    //By.ID()
    //By.Name()
    //By.ClassName()
    //By.TagName()
    //By.linkText()
    //By.PartialLinkText()
    //By.Xpath()
    //By.CssSelectors()
    
    
    
	
	
}

}
