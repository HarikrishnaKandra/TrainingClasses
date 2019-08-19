package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailScenario 
{

public static void main(String[] args) throws InterruptedException 
   {
	   //Chrome Browser 
	   System.setProperty("webdriver.chrome.driver","D:\\Setupfiles\\chromedriver_win32\\chromedriver.exe");
	   // Webdriver is an Interface 
	   // Creating  an object for Chromedriver() class and assigning object to WebDriver interface
	   WebDriver driver = new ChromeDriver();	
	   // get() this method loads a new Webpage in the current browser window.
	   driver.get("https://www.gmail.com");	
	   //Maximize browser
	   driver.manage().window().maximize();
	   //logging the gmail
	   driver.findElement(By.name("identifier")).sendKeys("bitsndbytesst@gmail.com",Keys.ENTER);
	   Thread.sleep(3000);
	   driver.findElement(By.name("password")).sendKeys("bitsndbytes",Keys.ENTER);
	    
	   Thread.sleep(5000);
	   //validating the logging
	   if(driver.findElement(By.className("gb_Ba")).isDisplayed())
	   {
		   System.out.println("Gmail account logged in with the given credentilas");
	   }
	   else
	   {
		   System.out.println("Gmail account is not logged in");
	   }
	   //Sending the Mail
	   driver.findElement(By.xpath("//div[text()='Compose']")).click();
	   driver.findElement(By.name("to")).sendKeys("krish0134@gmail.com");
	   driver.findElement(By.name("subjectbox")).sendKeys("Automated");
	   driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("This is the test messages from automation");
	   driver.findElement(By.xpath("//*[text()='Send']")).click();
	   //logout the mail 
	   driver.findElement(By.xpath("//span[@class='gb_Ba gbii']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Sign out")).click();
	   Thread.sleep(3000);
	   //Validating logged out
	   if(driver.findElement(By.name("password")).isDisplayed())
	   {
		   System.out.println("Gmail account logged out successfully");
	   }
	   else
	   {
		   System.out.println("Gmail account is not logged out");
	   }
	   // closing the browser
	   driver.close();
	}  
	}
	    



