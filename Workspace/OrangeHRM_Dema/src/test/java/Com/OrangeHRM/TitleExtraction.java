package Com.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleExtraction {

	WebDriver driver;
	String chechBoxName;

	@Test
	public void fTitleExtraction() throws InterruptedException {
		driver.get("https://lacounty.maps.arcgis.com/home/gallery.html?view=grid&sortOrder=asc&sortField=title&focus=layers");

		//WebElement Parentele = driver.findElement(By.className("block-group block-group-4-up laptop-block-group-3-up tablet-block-group-2-up phone-block-group-1-up gallery-card-wrap js-gallery-wrap js-view"));
		        
		//List<WebElement> elements = Parentele.findElements(By.xpath("//*[@id*='uniqName']"));
		//System.out.println( elements.size());
		
		List<WebElement> elements = driver.findElements(By.xpath("//h4/a[@title]"));
		System.out.println( elements.size());
		System.out.println( elements.size());

		// String title =
		// driver.findElement(By.xpath("//*[@id="uniqName_11_40"]/div/div[1]/h4/a")).getAttribute("title");
		// System.out.println(title);
		//

		// *[@id="uniqName_11_40"]/div/div[1]/h4/a

		// *[@id="uniqName_14_0"]/div[8]
		//// *[contains(@id,'uniqName_')]/div/div[1]/h4/a
		// *[@id="uniqName_11_40"]/div/div[1]/h4/a
		// *[contains(@id,'uniqName')]

		// List<WebElement> elements =
		// driver.findElements(By.xpath("//*[@id*='uniqName'"));

		for (WebElement element : elements) {
			
			System.out.println(element.getText());
		}

		// *[@id="uniqName_11_40"]/div/div[1]/h4/a

		// *[@id*="uniqName"]/div/div[1]/h4/a

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
