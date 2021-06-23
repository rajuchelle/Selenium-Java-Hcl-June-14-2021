package collectionsex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop1 = new Properties();
		
//		prop1.setProperty("FirstName","Raju");
//		prop1.setProperty("LstName","Chelle");
//		
//		System.out.println(prop1.getProperty("FirstName"));
//		"C:\\Users\\RAJU CHELLE\\Desktop\\ProperiesFile.properties"
		
		prop1.load(new FileInputStream(new File("C:\\Users\\RAJU CHELLE\\Desktop\\ProperiesFile.properties")));
		System.out.println(prop1.getProperty("FirstName"));
	}

}

