package Test1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensionandpostion 
{
public static void main(String[] args) throws InterruptedException 
{
	//Chrome Browser 
		System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
		
		// Webdriver is an Interface 
	    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
		WebDriver driver = new ChromeDriver();	
		
		// get() this method loads a new webpage in the current browser window.
	    driver.get("https://www.gmail.com");	
	    
	    driver.manage().window().maximize();
	    
	    //Size
	    int H=driver.manage().window().getSize().getHeight();
	    int W=driver.manage().window().getSize().getWidth();
	    
	    System.out.println(H);
	    System.out.println(W);
	    
	    Thread.sleep(5000);
	    Dimension d =new Dimension(800,300);
	    driver.manage().window().setSize(d);
	    
	    //Position
	    int X=driver.manage().window().getPosition().getX();
	    int Y=driver.manage().window().getPosition().getY();
	    
	    System.out.println("X-Value" + X);
	    System.out.println("Y-Value" + Y);
	    
	    Thread.sleep(5000);
	    //Setting Position hicvfghyfuyfgcvuy
	    
	    Point P = new Point(20,80);
	    driver.manage().window().setPosition(P);

}

}
