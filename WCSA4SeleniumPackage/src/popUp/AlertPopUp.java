package popUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/being/OneDrive/Desktop/WCSA4/AlertPopUp.html");
		
		WebElement button = driver.findElement(By.xpath("//button[.='Click me!']"));
		button.click();
		
		// now switch your control to AlertPopUp
		Alert al = driver.switchTo().alert();
		
		// accept the AlertPopUP
		Thread.sleep(2000);
		al.accept();
		
		// dismiss the AlertPopUP
		//al.dismiss();
		
		// text of AlertPopUP
		//String textOfAlert = al.getText();
		//System.out.println(textOfAlert);
		
		//al.sendKeys("alert");
		
	}

}
