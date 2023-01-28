package MethodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usernameTextbox=driver.findElement(By.name("username"));
		usernameTextbox.sendKeys("Admin");
		WebElement passwordTextbox = driver.findElement(By.name("password"));
		passwordTextbox.sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=\" Login \"]")).click();
		
		
		

	}

}
