package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void sumo() 
  {
	  Reporter.log("This is Sumo Method!",true);
  }
  
  @Test
  public void sumo1() 
  {
	  Reporter.log("This is Sumo1 Method!!",true);
  }
  
  @Test
  public void sumo2() 
  {
	  Reporter.log("This is Sumo2 Method!!!",true);
  }
  
}
