package TestNG_Concepts.TestNG_Concepts;


import org.testng.annotations.Test;

public class Groups {
	
	
	
	@Test(dependsOnMethods = "sum1")
	public void sum()
	{
		System.out.println("sum");
	}
	@Test
	public void sum1()
	{
		System.out.println("sum1");
	}
	@Test(groups= {"Sanity"})
	public void sum2()
	{
		System.out.println("Demo2sum2");
	}
	
	@Test(groups= {"Sanity"})
	public void Login()
	{
		System.out.println("Login");
	}
	@Test(groups= {"Smoke"})
	public void upload()
	{
		System.out.println("upload");
	}
	@Test(groups= {"Smoke"})
	public void Pass()
	{
		System.out.println("Pass");
	}
	@Test
	public void Fail()
	{
		System.out.println("Pass");
	}
	@Test
	public void AB()
	{
		System.out.println("AB");
	}

	@Test
	public void AA()
	{
		System.out.println("  AA");
	}

	@Test
	public void BB()
	{
		System.out.println(" @AfterTest BB Demo2");
	}


}
