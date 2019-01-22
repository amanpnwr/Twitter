package Twitter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

		public static void main(String[] args) {
			Properties prop = new Properties();
			try {
				// load a properties file for reading
				prop.load(new FileInputStream("D:\\Aman\\HTML\\src/Schedule.properties"));
				// get the properties and print
				prop.list(System.out);
				//Reading each property value
				System.out.println(prop.getProperty("FileName"));
				System.out.println(prop.getProperty("Author_Name"));
				System.out.println(prop.getProperty("Website"));
				System.out.println(prop.getProperty("TOPIC"));
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
