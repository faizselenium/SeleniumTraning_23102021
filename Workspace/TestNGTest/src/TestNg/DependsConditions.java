package TestNg;

import org.testng.annotations.Test;

public class DependsConditions {

	
	@Test(dependsOnGroups = "Sanity")
	public void Test()
	{
		System.out.println("5");
	}
	
	@Test(dependsOnMethods = "sum1",groups= {"Sanity"})
	public void sum()
	{
		System.out.println("4");
	}
	@Test(dependsOnMethods = "sum2",groups= {"Smoke"})
	public void sum1()
	{
		System.out.println("3");
	}
	@Test(dependsOnMethods = "Login")
	public void sum2()
	{
		System.out.println("2");
	}
	
	@Test
	public void Login()
	{
		System.out.println("1");
	}
	@Test(enabled = false)
	public void Login1()
	{
		System.out.println("Login1");
	}
}
