package Practice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest {
	
	
	@Test
	public void m3(){
		Reporter.log("hello1",true);
	}
	
	@Test
	public void m4(){
		Reporter.log("bye1",true);
	}

}
