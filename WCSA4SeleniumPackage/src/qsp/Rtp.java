package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String browserValue =sc.next();
		System.out.println("Which Browser You Want To Open");
		if(browserValue.equalsIgnoreCase("chrome"));
		{
			System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
			driver=new ChromeDriver();
			
		}

	}

}
