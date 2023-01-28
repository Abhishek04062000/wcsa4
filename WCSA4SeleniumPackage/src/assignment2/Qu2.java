package assignment2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Close parent & Child window Without Quit()
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		 
		 Set<String> allHandels = driver.getWindowHandles();
		 Thread.sleep(2000);
		 for(String wh:allHandels)
		 {
			 driver.switchTo().window(wh).close();
		 }

	}

}
