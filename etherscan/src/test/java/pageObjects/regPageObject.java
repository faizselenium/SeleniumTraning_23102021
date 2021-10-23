package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class regPageObject {

	public WebDriver driver;

	public regPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By userNamebox = By.id("ContentPlaceHolder1_txtUserName");

	By eMailAddress = By.id("ContentPlaceHolder1_txtEmail");
	
	By password = By.id("ContentPlaceHolder1_txtPassword");

	By confirmPass = By.id("ContentPlaceHolder1_txtPassword2");
	
	By terms = By.xpath("//*[@id=\"ContentPlaceHolder1_maindiv\"]/div[4]/div/label/span/a");  
	//#ContentPlaceHolder1_maindiv > div:nth-child(4) > div > label > span > a
	////*[@id="ContentPlaceHolder1_maindiv"]/div[4]/div/label/span/a
	
	public WebElement termsLink() {

		return driver.findElement(terms);
	}

	public WebElement userNameEdit() {

		return driver.findElement(userNamebox);
	}

	public WebElement eMailAddress() {

		return driver.findElement(eMailAddress);
	}

	public WebElement password() {

		return driver.findElement(password);
	}

	public WebElement confirmPass() {

		return driver.findElement(confirmPass);
	}

}
