package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		// to perform Scrolling Operation
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		// to perform scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-4500);");

	}

}
