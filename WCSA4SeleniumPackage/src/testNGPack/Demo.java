package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	  //System.out.println("This is Demo Method!");
	  Reporter.log("This is Demo Method!",true);
  }
  
  @Test
  public void demo1() 
  {
	  Reporter.log("This is Demo1 Method!!",true);
  }
  @Test
  public void demo2()
  {
	  int a=69;
	  int b=2;
	  int res=a/b;
	  Reporter.log("This is demo2 method!!!",true);
	  Reporter.log("Result is "+res,true);
	  
  }
  
}
