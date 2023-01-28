package assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// How to Close Child Browser
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		 
		 String parentHandel = driver.getWindowHandle();
		 System.out.println(parentHandel);
		 System.out.println("-----------------------------------");
		 
		 Set<String> allHandel = driver.getWindowHandles();
		 Thread.sleep(2000);
		 for(String wh:allHandel)
		 {
			 System.out.println(wh);
			 if(!parentHandel.equals(wh))
			 {
				 driver.switchTo().window(wh).close();
			 }
			 else
			 {
				 
			 }
			 
		 }

	}

}
