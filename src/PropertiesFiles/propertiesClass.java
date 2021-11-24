package PropertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertiesClass {

	public static void main(String[] args) throws Throwable {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream("src/PropertiesFiles/myFile.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("City"));
		System.out.println(prop.getProperty("PhoneNo"));

	}

}
