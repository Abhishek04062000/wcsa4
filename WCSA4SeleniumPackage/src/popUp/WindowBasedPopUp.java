package popUp;

//import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBasedPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		 driver.get("http://127.0.0.1/administration/customization.do");
		
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
		 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		 driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
		 
		 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		 Thread.sleep(2000);
		 // target.click();
		
		 Actions act=new Actions(driver);
		 // to perform double click action
		 act.doubleClick(target).perform();
		 
		// File file = new File("./autoIt/Auto3.exe");
		 
		 //String abs = file.getAbsolutePath();
		 //Thread.sleep(3000);
		 
		 Runtime.getRuntime().exec("C:\\Users\\being\\OneDrive\\Desktop\\WCSA4\\WCSA4SeleniumPackage\\autoIt\\Auto2.exe");
		 Thread.sleep(3000);
		// Runtime.getRuntime().exec(abs);
		 
		 
	}

}
