package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
/*	
	@Test
	public void sum()
	{
		System.out.println("Demo2sum");
	}
	@Test
	public void sum1()
	{
		System.out.println("Demo2sum1");
	}*/
	@Test(groups= {"Sanity"})
	public void sum2()
	{
		System.out.println("Demo2sum2");
	}
	
	@BeforeSuite(groups= {"Sanity"})
	public void BeforeSuite()
	{
		System.out.println("Demo2 @BeforeSuite");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Demo2 BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Demo2 AfterMethod");
	}
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Demo2 @AfterSuite");
	}
	@Test
	public void AB()
	{
		System.out.println("Demo2 AB");
	}

	@BeforeTest
	public void AA()
	{
		System.out.println(" @BeforeTest AA Demo2");
	}

	@AfterTest
	public void BB()
	{
		System.out.println(" @AfterTest BB Demo2");
	}

}
