package Demo3;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {
 
 //Soft assert and hard assert
 
 // Hard Assert -- if assertion failes it will not execute the further script
 /*@Test
 public void method1() {
 
  Assert.assertEquals(19, 19,"Value is not matching");
  System.out.println("hello");
  
 }*/
 
 
 
 
 //Soft assert
 
 @Test
 public void method2() {
  
  SoftAssert assertion=new SoftAssert();
  

  assertion.assertEquals(12, 12);
  System.out.println("hello after test");
  
    assertion.assertAll();//This is mandotry line
  
 }
 
 

}