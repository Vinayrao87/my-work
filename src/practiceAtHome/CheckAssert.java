package practiceAtHome;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class CheckAssert {

@Test(groups="smoke")
public void m1(){
	Reporter.log("m1",true);
}
	
@Test(groups="smoke")
public void m2(){
	Reporter.log("m2",true);
}
@Test(groups="regression")
public void m3(){
	Reporter.log("m3",true);
}
@Test(groups="regression")
public void m4(){
	Reporter.log("m4",true);
}
@Test(groups={"regression","smoke"})
public void m5(){
	Reporter.log("m5",true);
}
@Test(groups={"regression","smoke"})
public void m6(){
	Reporter.log("m6",true);
}
}
