package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrizationTestngxml2 {

	@Parameters({"dev","OS"})
	@Test
	public void Test(String par,String os)
	{
		System.out.println("Test2");
		System.out.println(par);
		System.out.println(os);
	}
	}
