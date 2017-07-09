package BTM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Abcd {
	
@Test(dataProvider="getData",dataProviderClass=DemoB1.class)
public void retrievedata(String un, int pwd){
	Reporter.log(un+"   "+pwd,true);
}

}
