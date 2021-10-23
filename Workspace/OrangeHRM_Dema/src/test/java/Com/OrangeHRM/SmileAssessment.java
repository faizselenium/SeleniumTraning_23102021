//package Com.OrangeHRM;
//
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//import org.testng.annotations.BeforeTest;
//
//import java.util.Hashtable;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//
//public class SmileAssessment {
//	
//	public static ExcelReader excel = null;
//
//	@DataProvider
//	public static Object[][] getData(){
//		
//		
//		if(excel == null){
//			
//			
//			excel = new ExcelReader("c:\\selenium\\testngdata.xlsx");
//			
//			
//		}
//		
//		String sheetName="loginTest";
//		int rows = excel.getRowCount(sheetName);
//		int cols = excel.getColumnCount(sheetName);
//		
//		Object[][] data = new Object[rows-1][1];
//		
//		Hashtable<String,String> table = null;
//		
//		for(int rowNum=2; rowNum<=rows; rowNum++){
//			
//			table = new Hashtable<String,String>();
//			
//			for(int colNum=0; colNum<cols; colNum++){
//				
//		//	data[rowNum-2][colNum]=	excel.getCellData(sheetName, colNum, rowNum);
//		
//			table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));	
//			data[rowNum-2][0]=table;	
//				
//			}
//			
//		}
//		
//		
//		return data;
//		
//		
//	}
//	
//
//	
//	
//	WebDriver driver;
//  @Test(dataProvider="getData")
//  public void EndToEnd(Hashtable<String,String> data) 
//  {
//	  String firstOption = "parent";
//	  //String firstOption = "teen";
//	  //String secondOption = "crossbite";
//	  String secondOption = "gap_teeth";
//	  String dropDownoption = "We'd like to set up an appointment for a consultation";
//	  String patientFirstName = "jacob";
//	  String patientLastName = "smith";
//	  String zipCode = "411013";
//	  String email = "john.smith@gmail.com";
//	  String phone = "9922334455";
//	  String DOB ="12/31/2000";
//	  String text;
//	  
//	   driver.get("https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment");
//	   driver.findElement(By.id("epdsubmit")).click();
//	   
//	   //Selecting the 1st option
//	   driver.findElement(By.id(firstOption)).click();
//	   
//	   //selecting the second option
//	   driver.findElement(By.cssSelector("div[data-value='"+secondOption+"']")).click();
//		
//	   //Selecting the values from the dropdown
//	   
//	   Select select = new Select(driver.findElement(By.id("status")));
//	   select.selectByVisibleText(dropDownoption);
//	   
//	   driver.findElement(By.id("first_name")).sendKeys(patientFirstName);
//	   driver.findElement(By.id("last_name")).sendKeys(patientLastName);
//	   driver.findElement(By.id("txtDOB")).sendKeys(DOB);
//	   driver.findElement(By.id("txtZip")).sendKeys(zipCode);
//	   driver.findElement(By.id("email")).sendKeys(email);
//	   driver.findElement(By.id("phone")).sendKeys(phone);
//	   driver.findElement(By.cssSelector("a[onclick = 'RASubmit.submit();']")).click();
//	   
//	   //Verifying the user 
//	   text = driver.findElement(By.xpath("//h2[contains(text(),'"+patientFirstName+"’s results')]")).getText();
//	   Assert.assertTrue(text.contains(patientFirstName));
//	   
//	   
//  }
//  
//  
//  @BeforeTest
//  public void beforeTest() {
//	  WebDriverManager.chromedriver().setup();
//		// WebDriverManager.firefoxdriver().setup();
//		// WebDriverManager.edgedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//  }
//
//  @AfterTest
//  public void afterTest1() {
//	  //driver.quit();
//  }
//
//}
