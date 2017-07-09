package BTM;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestListener.class)
public class TestingAssert {
	
	@Test
	public void m2(){
//		Reporter.log("test is executed",true);
		
	}
	
	@Test(dependsOnMethods="m3")
	public void m1(){
		Reporter.log("test is executed",true);
		Assert.fail();
	}
	@Test(enabled=false)
	public void m3(){
//		Reporter.log("test is executed",true);
		
	}
	
}
