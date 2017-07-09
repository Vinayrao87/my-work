package Practice1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
	public void m1(){
		Reporter.log("BeforeSuite",true);
	}
	@AfterSuite
	public void m2(){ 
		Reporter.log("AfterSuite",true);
		}
	@BeforeTest
	public void m3(){
		Reporter.log("BeforeTest",true);
	}
	@AfterTest
	public void m4(){
		Reporter.log("AfterTest",true);
	}
	@AfterClass
	public void m5(){
		Reporter.log("AfterClass",true);
	}
	@BeforeClass
	public void m6(){
		Reporter.log("BeforeClass",true);
	}
	@BeforeMethod
	public void m7(){
		Reporter.log("BeforeMethod",true);
	}
	@AfterMethod
	public void m8(){
		Reporter.log("AfterMethod",true);
	}
	
	
	
	

}
