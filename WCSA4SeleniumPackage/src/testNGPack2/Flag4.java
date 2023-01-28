package testNGPack2;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	static WebDriver driver;
	
  @Test
  public void logingMethod() 
  {
	  Reporter.log("Login is Done",true);
  }
  
  @Test(dependsOnMethods = "logingMethod")
  public void createUser()
  {
	  Reporter.log("User Created",true);
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logoutMethod()
  {
	  Reporter.log("Logout Done",true);
  }
  
}
