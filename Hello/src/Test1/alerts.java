package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts 
{

public static void main(String[] args) throws InterruptedException
{
	//Chrome Browser 
	System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
	
	// Webdriver is an Interface 
    // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
	WebDriver driver = new ChromeDriver();	
	
	// get() this method loads a new webpage in the current browser window.
    driver.get("http://rms.aetins.com/newlook/index.php");	
    driver.manage().window().maximize();
    		
    /*Alert is a popup window which displays when performed some action and sometimes without any reason also 
     (Security alert.Now if you want to handle those alerts then you have to use Alert interface available in org.openqa.selenium package
     1.Accept()
     2.authenticateUsing(Credentials Credentials)
     3.dismiss()
     4.getText()
     5.sendKeys()    
     */
    driver.findElement(By.name("btn_link_OO")).click();
    
    String text= driver.switchTo().alert().getText();
   
    System.out.println(text);
    
    Thread.sleep(3000);
    driver.switchTo().alert().accept();

}

}
