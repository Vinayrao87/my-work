package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoA {
	
	
	@BeforeClass
	public void openApp(){
		Reporter.log("openApp",true);
	}
	
	@AfterClass
	public void closeApp(){
		Reporter.log("closeApp",true);
	}
	
	@BeforeMethod
	public void login(){
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout(){
		Reporter.log("logout",true);
	}
	
	@Test(priority=-3)
	public void testA2(){
		Reporter.log("testA2....",true);
		}
	@Test(priority=1)
	public void testA1(){
		Reporter.log("testA1....",true);
	}

	
	
	
}
