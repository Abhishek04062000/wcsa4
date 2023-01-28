package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrivers.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		driver.findElement(By.name("userLoginId")).sendKeys("beingtracker@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Snoopdogg@04");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.=\"Sign In\"]")).click();
		

	}

}
