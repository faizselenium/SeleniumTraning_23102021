package TestNG_Concepts.TestNG_Concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrizationTestngxml {

	@Parameters({"dev","OS"})
	@Test
	public void Test(String par,String os)
	{
		System.out.println("Test");
		System.out.println(par);
		System.out.println(os);
	}
	}
