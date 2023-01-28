package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PumaLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		driver.findElement(By.name("email")).sendKeys("beingtracker@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Louisvuitton@04");
		driver.findElement(By.id("login-submit")).click();
		
		

	}

}
