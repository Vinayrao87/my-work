package dipu;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_class {
	
	@Test
	public void a(){
		Reporter.log("first method",true);
	}
	@Test
	public void b(){
		Reporter.log("second method",true);
	}

}
