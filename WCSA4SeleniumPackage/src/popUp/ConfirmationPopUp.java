package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/being/OneDrive/Desktop/WCSA4/confirmPopUp.html");
		
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		Alert cnf = driver.switchTo().alert();
		// to accept the popUp
		cnf.accept();
		
		//to dismiss the PopUp
		//cnf.dismiss();

	}

}
