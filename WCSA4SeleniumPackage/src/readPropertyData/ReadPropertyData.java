package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./data/config.properties"); // provide the path  of property file
		
		 Properties prop = new Properties(); // to read data
		 prop.load(fis); //used to read the file
		
		 String data = prop.getProperty("Browser");
		 System.out.println(data);

	}

}
