package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://127.0.0.1/login.do;jsessionid=23208t440ukds");
		 
		 Flib flib = new Flib();
		 String username = flib.readExcelData("./data/ActiTimeTestData", "validcreds",1,0);
		 String password = flib.readExcelData("./data/ActiTimeTestData", "validcreds",1,1);
		 
		 driver.findElement(By.name("username")).sendKeys(username);
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 driver.findElement(By.id("loginButton")).click();
		 

	}

}
