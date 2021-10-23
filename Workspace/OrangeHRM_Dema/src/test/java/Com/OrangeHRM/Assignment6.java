package Com.OrangeHRM;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Assignment6 {

	WebDriver driver;
	String chechBoxName;

	@Test
	public void flogin() throws InterruptedException {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		// WebElement ucheckBoxBlock =
		// driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]"));
		WebElement ucheckBoxBlock = driver.findElement(By.id("checkbox-example"));

		//System.out.println(ucheckBoxBlock.findElements(By.tagName("input")).size());

		for (int i = 0; i < ucheckBoxBlock.findElements(By.tagName("input")).size(); i++) {
			
			//System.out.println(ucheckBoxBlock.findElements(By.tagName("input")).get(i).getAttribute("value"));
			if(i==1) 
			{	
				ucheckBoxBlock.findElements(By.tagName("input")).get(i).click();
				 chechBoxName= ucheckBoxBlock.findElements(By.tagName("input")).get(i).getAttribute("value");
				System.out.println(chechBoxName);
				
				
			}
			Thread.sleep(300);

		}
		
		Select selectclass = new Select(driver.findElement(By.id("dropdown-class-example")));
		driver.findElement(By.id("dropdown-class-example")).click();
		System.out.println(chechBoxName);
		selectclass.selectByValue(chechBoxName);
		driver.findElement(By.id("name")).sendKeys(chechBoxName);
		driver.findElement(By.id("alertbtn")).click();
		
		//Alert alert = new Alert();
		System.out.println( driver.switchTo().alert().getText().contains(chechBoxName));
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest1() {
		//driver.quit();
	}

}
