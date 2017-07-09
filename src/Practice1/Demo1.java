package Practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest {
	
	@Test(priority=1,enabled=false)
	public void m1(){
		
		Reporter.log("m1",true);
	}
	@Test(priority=2)
	public void m3(){
		
		Reporter.log("m3",true);
	}
	
	@Test (priority=4)
	public void m2(){
		Reporter.log("m2",true);
	}
	@Test(dependsOnMethods={"m3"},priority=3)
	public void m4(){
		
		Reporter.log("m4",true);
	}

}
