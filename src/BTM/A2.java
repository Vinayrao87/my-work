package BTM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A2 extends A1 {

	@Test(priority=-1)
	public void test1(){
		//Reporter.log("test1",true);
		System.out.println(1/0);
	}

	@Test(priority=-2)
	public void test2(){
		Reporter.log("test2",true);
	}

}
