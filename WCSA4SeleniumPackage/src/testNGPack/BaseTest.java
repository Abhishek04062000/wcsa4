package testNGPack;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	 WebDriver driver;
 @Test
  public void setup() 
  {
	 
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://127.0.0.1/login.do;jsessionid=9hrs0g44gjq4q");
	  
  }
 
		 @AfterMethod
		 public void tearDown()
		 {
		   driver.quit();		
		 }
 
}
