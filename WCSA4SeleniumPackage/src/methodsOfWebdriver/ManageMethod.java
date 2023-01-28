package methodsOfWebdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		Dimension targetSize=new Dimension(250,350);
		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(4000);
		
		Point point=new Point(30,250);
		driver.manage().window().setPosition(point);
		
		Thread.sleep(4000);

	}

}
