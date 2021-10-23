package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	/*
	 * @Test public void sum() { System.out.println("Demosum"); }
	 */
	
	@Test(groups= {"Sanity"})
	public void AB() {
		System.out.println("Demo AB");
	}
	@Test(groups= {"Sanity"})
	public void AB1() {
		System.out.println("Demo AB1");
	}

	@BeforeMethod(groups= {"Sanity"}) 
	public void BeforeMethod() {
		System.out.println("Demo BeforeMethod");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Demo AfterMethod");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Demo @BeforeSuite");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("Demo @AfterSuite");
	}

	@BeforeTest
	public void AA() {
		System.out.println(" @BeforeTest AA Demo");
	}

	@AfterTest
	public void BB() {
		System.out.println(" @AfterTest BB Demo");
	}
}
