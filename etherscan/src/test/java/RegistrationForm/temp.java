package RegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\LAH_Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		//driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
//		
		WebElement element1 = driver.findElement(By.id("continue")); 
	
		
		//WebElement element1 = driver.findElement(By.linkText("Mobiles"));  
		System.out.println(element1.isDisplayed());
		System.out.println(element1.isEnabled());
		System.out.println(element1.isSelected());
						
//		WebElement element2 = driver.findElement(By.linkText("Customer Service"));  
//		
		//Actions action = new Actions(driver);  
		//action.contextClick(element).perform();
//		action.moveToElement(element1).perform();
//		action.moveToElement(element2).perform();
//		driver.navigate().refresh();
		
//		driver.switchTo().frame("ape_Gateway_right-2_desktop_iframe");
//		
//		driver.switchTo().defaultContent(); 
		
	

	}

}
