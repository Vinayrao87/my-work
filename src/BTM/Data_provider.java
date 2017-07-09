package BTM;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Data_provider {
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]="UserA";
		data[0][1]=1234;
		data[1][0]="UserB";
		data[1][1]=5678;
		return data;		
	}
	
	
	@Test(priority=-2,dataProvider="getData")
	public void createUser(String un,int pw){
	
		Reporter.log(un+" , "+pw,true);
		Assert.assertEquals(1, 2);
		
	}

	
//	@Test(dataProvider="getData")
	public void createUser1(String un,int pw){
		Reporter.log("printing before softAssert",true);
		SoftAssert s=new SoftAssert();
		s.assertEquals(1, 2);
		s.assertAll();
//		s.assertAll(); to make a condition fail if softassert fails
//		We need to call assertAll() then only it will fail the execution
//		in case if it fails. It should be written in the last or else all the
//		statements written below it won't be executed in case of fail.
		Reporter.log(un+" , "+pw,true);
		
	}
	
}
