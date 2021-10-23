package OrangeHRM_Dema.MavenProject;

import org.testng.annotations.Test;

public class RestAPITest {

	
	@Test
	public void sub(){
		
		System.out.println("RestAPI");
	}
	
	
	
//	
//	@Test
//	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
//	        
//	    given().
//	    when().
//	        get("http://ergast.com/api/f1/2017/circuits.json").
//	    then().
//	        assertThat().
//	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
//	}
	
	
	
	
//	@Test
//	public void test_ResponseHeaderData_ShouldBeCorrect() {
//	        
//	    given().
//	    when().
//	        get("http://ergast.com/api/f1/2017/circuits.json").
//	    then().
//	        assertThat().
//	        statusCode(200).
//	    and().
//	        contentType(ContentType.JSON).
//	    and().
//	        header("Content-Length",equalTo("4567"));
//	}

	
	
//	
//	@Test(dataProvider="seasonsAndNumberOfRaces")
//	public void test_NumberOfCircuits_ShouldBe_DataDriven(String season, int numberOfRaces) {
//	                
//	    given().
//	        pathParam("raceSeason",season).
//	    when().
//	        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
//	    then().
//	        assertThat().
//	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
//	}
}
