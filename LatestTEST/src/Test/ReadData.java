package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("C:\\LAH\\New folder\\Selenium_Harman_Traning\\LatestTEST\\src\\Test\\input.properties");
		pro.load(file);
		System.out.println(pro.getProperty("URL"));
		pro.setProperty("URL", "DEFghi.com");
		FileOutputStream fos =new FileOutputStream("C:\\\\LAH\\\\New folder\\\\Selenium_Harman_Traning\\\\LatestTEST\\\\src\\\\Test\\\\input.properties");

		pro.store(fos, null);
	}

}
