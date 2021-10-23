package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderclass {
	
	@DataProvider
	public Object[][] GetData()
	{
		Object[][] objData = new Object[4][2];
		
		objData[0][0] = "user1";
		objData[0][1] = "Pass1";
		
		objData[1][0] = "user2";
		objData[1][1] = "Pass2";
		
		objData[2][0] = "user3";
		objData[2][1] = "Pass3";
		
		objData[3][0] = "user4";
		objData[3][1] = "Pass4";
		
		return objData;
		
	}
	
	
	
	
	@Test(dataProvider="GetData")
	public void sum2(String name, String Pass)
	{
		System.out.println(name);
		System.out.println(Pass);
	}

}
