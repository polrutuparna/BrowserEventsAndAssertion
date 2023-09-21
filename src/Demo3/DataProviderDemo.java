package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
 public WebDriver driver;
 @Test(dataProvider="testData")
 public void method1(String username, String password) {
  
	 System.setProperty("webdriver.chrome.driver", "C:\\Rutu\\Selenium\\ChromeDriver\\chromedriver-win32\\chromedriver.exe");
	  
     driver = new ChromeDriver();
 driver.get("https://login.salesforce.com/?locale=in");
 
 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
 
 }
 
 
 @DataProvider
 public Object[][] testData() {
  Object[][] data=new Object[3][2];
  data[0][0]="testuser1";
  data[0][1]="secure123";
  data[1][0]="testuser2";
  data[1][1]="secure345";
  data[2][0]="testuser3";
  data[2][1]="secure899";
  
  
  return data;
  
 }
 

}