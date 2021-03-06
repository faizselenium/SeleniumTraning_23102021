package Com.OrangeHRM;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data_read_from_table {

	WebDriver driver;
	String chechBoxName;

	@Test
	public void fTitleExtraction() throws InterruptedException {

		// driver.get("https://lacounty.maps.arcgis.com/home/webmap/viewer.html?featurecollection=https%3A%2F%2Farcgis.gis.lacounty.gov%2Farcgis%2Frest%2Fservices%2FCities%2FCity_RollingHills_Eastfield_Edison_Poles%2FFeatureServer%3Ff%3Djson%26option%3Dfootprints&supportsProjection=true&supportsJSONP=true");
		//driver.get("https://lacounty.maps.arcgis.com/home/webmap/viewer.html?useExisting=1&layers=13486340fe1c4fdda16d95fb856177cb");
		
		driver.get("https://lacounty.maps.arcgis.com/home/webmap/viewer.html?useExisting=1&layers=e801df58a2874fad8f3c04824a08de22");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// System.out.println("yes");

		Actions actions = new Actions(driver);

		WebElement MouseOver = driver.findElement(By.xpath("//span[starts-with(@title,'Show Table')]"));
		// Mouse hover menuOption 'Music'
		actions.moveToElement(MouseOver).perform();

		driver.findElement(By.xpath("//span[starts-with(@title,'Show Table')]")).click();
		driver.findElement(By.xpath("//div[@title = 'Options']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Show/Hide Columns')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'All Columns')]")).click();
		// h4/a[@title]
		driver.findElement(By.xpath("//div[@data-dojo-attach-point='_gridTitleNode']")).click();

		
		 List<WebElement> elementsHeader =
		 driver.findElements(By.xpath("//table/tr/th/div/div/div"));
		 System.out.println(elementsHeader.size());
		
		 for (WebElement element1 : elementsHeader) {
		
			 System.out.println(element1.getText());
		
		 }
		

		List<WebElement> elements11 = driver.findElements(By.xpath("//table/tr/td"));
		System.out.println(elements11.size());

		for (WebElement element : elements11) {

			System.out.println(element.getText());

		}

	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest1() {
		// driver.quit();
	}

}
