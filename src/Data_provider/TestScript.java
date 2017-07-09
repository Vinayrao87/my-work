package Data_provider;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListeners.class)
public class TestScript {
	@Test
	public void testA(){
		Reporter.log("Running testA",true);
	}
	
	@Test
	public void testB(){
		Reporter.log("running testB",true);
	}
	

}
