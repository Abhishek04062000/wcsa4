package takeScreenShotDynamic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	WebDriver driver;
  @Test
  public void initialization() 
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("http://127.0.0.1/login.do;jsessionid=9hrs0g44gjq4q");
  }
  
  @Test
  public void failed(String methodName)
  {
	  try
	  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenShorts/"+methodName+".png");
	  Files.copy(src, dest);
	  }
	  
	  catch(Exception e)
	  {
		  
	  }
  }
  
}
