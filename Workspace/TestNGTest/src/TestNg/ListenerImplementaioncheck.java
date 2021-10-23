package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerImplementaioncheck {
	
	@Test
	public void sum()
	{
		System.out.println("sum");
		Assert.assertEquals("1", "2");
		//assrt.assertEquals("str", "2");
	}
	@Test
	public void sum1()
	{
		System.out.println("sum1");
		Assert.assertEquals("1", "2");
		//assrt.assertEquals("str", "2");
	}
}
