package OrangeHRM_Dema.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleExtraction {

	
	 static WebDriver driver;
	 
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		System.setProperty("webdriver.chrome.driver", "chrome_driver_path");

		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.edureka.co/devops");
		  
		  String output = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[1]/div[2]/div[1]/div")).getText();
		  File DestFile= new File("extractedFilePath");
		  FileUtils.writeStringToFile(DestFile, output);
		  driver.close();

	}

}
