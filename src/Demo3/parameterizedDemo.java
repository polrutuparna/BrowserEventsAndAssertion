/*
 Due To Parameterized Code - User can Not Run the programme from here. 
 Go to XML file -> Run TestNG Suit
 
 * */


package Demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedDemo {

 @Test
 @Parameters({"username","password"})
 public void login(String username1, String Password) {
  
  System.out.println(username1);
  System.out.println(Password);
  
  
 }
 

 

}



