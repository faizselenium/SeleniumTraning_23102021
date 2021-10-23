package RegistrationForm;

import java.io.IOException;


import org.testng.annotations.Test;

import pageObjects.regPageObject;

public class registrationPage extends Base {

	@Test
	public void openUrl() throws IOException, InterruptedException {
		
		
		driver = initializeDriver();
		driver.get("https://etherscan.io/register");
		
		regPageObject reg= new regPageObject(driver);
		reg.userNameEdit().sendKeys("abc");
		reg.eMailAddress().sendKeys("dfc");
		reg.password().sendKeys("acns");
		reg.confirmPass().sendKeys("acns");
		Thread.sleep(15);
		//driver.close();
		reg.termsLink().click();
		
	}

}
