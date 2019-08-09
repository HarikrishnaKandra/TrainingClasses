package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserandcloseBroswser {

	public static void main(String[] args) throws InterruptedException 
	{   
		
		//Chrome Browser 
		System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
		
		//Firefox browser
		System.setProperty("Webdriver.gecko.driver","Path of the geckodriver");
		
		//IE Browser 
		System.setProperty("webdriver.ie.driver","Path of the IEdriverserver");
		
	    // Webdriver is an Interface 
	    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
		WebDriver driver = new ChromeDriver();
		
		// get() this method loads a new webpage in the current browser window.
		driver.get("https://www.gmail.com");
		
		//Closes the current window, quitting the browser if its the window currently opened
		driver.close();	
	}

}
