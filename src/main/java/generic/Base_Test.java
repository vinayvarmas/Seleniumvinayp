package generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	
	@BeforeSuite 
	
	public void beforeStrings() {
	
	Reporter.log("connection to server",true);
	
	}
	@BeforeTest
	
	public void beforemethod() {
		Reporter.log("connection to database",true);
	}
	@BeforeClass
	
	public void beforeclass() {
		Reporter.log("opening the browser",true);
	}
	
	@AfterClass
	
	public void afetrclass() {
		Reporter.log("closing the browser",true);
	}
	
	@AfterTest
	
	public void aftertest() {
		
		Reporter.log("disconnect the database",true);
	}
	
	@AfterSuite
	
	public void aftersuite() {
		Reporter.log("disconnect the serserver",true);
	}
	
	
}
