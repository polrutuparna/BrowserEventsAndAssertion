package Demo3;

import org.testng.annotations.Test; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class parrllelTestingDemo {

 public WebDriver driver;
   

 @Test
 public void FirefoxTest() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
  
  driver = new ChromeDriver(); //Session id is generated --1
    Thread.sleep(5000);
 driver.get("https://login.salesforce.com/?locale=in");
  System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
 }

 @Test
 public void ChromeTest() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	  
      driver = new ChromeDriver(); //Seesion id 2 generated
     Thread.sleep(5000);
  driver.get("https://login.salesforce.com/?locale=in");
   System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
  
 }
 
@AfterSuite
 public void closeBrowser()
 {
	 driver.quit();
 }

}