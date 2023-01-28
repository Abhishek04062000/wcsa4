package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/being/OneDrive/Desktop/WCSA4/SnacksM.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		Select sel=new Select(dropDownElement);
		List<WebElement> allOptions = sel.getOptions();
		
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement opt = allOptions.get(i);
			String values = opt.getText();
			System.out.println(values);
			Thread.sleep(2000);
			
			
		}

	}

}
