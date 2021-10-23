package RegistrationForm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		
		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\LAH\\New folder\\Selenium_Harman_Traning\\etherscan\\src\\test\\java\\RegistrationForm\\data.properties");
		pro.load(fis);
		String browserName = pro.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\LAH_Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
			 driver = new ChromeDriver();
			
			
		}
		else if (browserName.equals("IE")) 
		{
			// IE implementation
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}

}
