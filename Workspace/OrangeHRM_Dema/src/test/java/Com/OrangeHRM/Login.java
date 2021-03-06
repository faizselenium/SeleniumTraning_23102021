package Com.OrangeHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	@Test
	public void Login() {

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.edgedriver().setup();
		WebDriver driver = new InternetExplorerDriver();

		// driver.manage().window().maximize();

		// WebElement ele =driver.findElement(By.id(""));

		// List<WebElement> ele=driver.findElement(By.id(""));

		// WebElement ele=driver.findElements(By.id(""));

		// List<String> ele=driver.findElements(By.id(""));
		// System.out.println();

		// WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.manage().window().fullscreen();
		// Type the URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Enter the User Name and Enter the Password and Click on Login Button
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String ActElement = driver.findElement(By.linkText("Dashboard")).getText();
		String ExpElement = "Dashboard";
		Assert.assertEquals(ActElement, ExpElement);
		driver.findElement(By.id("welcome")).click();

		driver.findElement(By.linkText("Logout")).click();

		System.out.println(driver.findElement(By.id("logInPanelHeading")).isDisplayed());

		// String sValidateString =
		// driver.findElement(By.id("logInPanelHeading")).getText();
		// Assert.assertEquals("LOGIN Panel", sValidateString);

		// System.out.println(ActElement);
		// driver.close();//Close will close only current chrome browser
		// driver.quit();//Quit all browser opened by selenium

	}

}
