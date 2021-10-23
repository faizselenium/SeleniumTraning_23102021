package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//creating properties class object
			Properties proper = new Properties();
			//creating fileinputstream class object
			FileInputStream fis =new FileInputStream("C:\\Selenium_Harman_Traning\\Workspace\\TestNGTest\\Data.properties");
			//loading fis
			proper.load(fis);
			System.out.println(proper.getProperty("OS"));
			System.out.println(proper.getProperty("Test"));
			//setting property at run time
			proper.setProperty("OS", "MAC");
			proper.setProperty("Test", "UFT");
			FileOutputStream fos =new FileOutputStream("C:\\Selenium_Harman_Traning\\Workspace\\TestNGTest\\Data.properties");
			//updating properties in properties file
			proper.store(fos, null);
			System.out.println(proper.getProperty("OS"));
			System.out.println(proper.getProperty("Test"));
	}

}
