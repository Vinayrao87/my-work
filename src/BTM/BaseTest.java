package BTM;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	
	@BeforeSuite
	public void m1(){Reporter.log("before suite",true);	}
	
	@AfterSuite
	public void m2(){Reporter.log("After_Suite",true);}
	
	@AfterTest
	public void m3(){Reporter.log("after Test",true);	}
	
	@BeforeTest
	public void m4(){Reporter.log("before Test",true);	}
	
	@AfterClass
	public void m6(){Reporter.log("afterClass",true);}
	
	@BeforeClass
	public void m5(){Reporter.log("BeforeClass",true);}
	
	@BeforeMethod
	public void m7(){Reporter.log("Before Method",true);	}
	
	@AfterMethod
	public void m8(){Reporter.log("After Method",true);
	
	
	
	
	}
}
