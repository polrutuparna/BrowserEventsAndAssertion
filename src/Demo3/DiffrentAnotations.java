package Demo3;

import org.testng.annotations.Test;

public class DiffrentAnotations {

 
 @Test(enabled=false)
 public void method2() {
  System.out.println("method2");
 }
 
 
 /**
 Test Suite Level – This timeout will be applicable for all the tests in the said test suite. Each test in the suite must be executed with the configured timeout.
 The timeout counter will be reset after reach test method execution.
 Test Method Level – This timeout will be applicable for the said test method and will override the timeout period if configured at the suite level
 **/
 @Test(timeOut=5000)
 public void method3() {
  System.out.println("method2");
 }
 
 
 
 
 //This will run same test multiple times with same data
  @Test(invocationCount = 10)
  public void test2() {
   
   System.out.println("hello");
  }
 
 
 
 

 
 
}