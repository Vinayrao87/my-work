package Practice1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testassert {
	
	
	@Parameters({"password","username"})
	@Test
	public void m1(int pwd,String un){
		Reporter.log(un+"   "+pwd,true);
	}
	
	
	
}
