package Practice1;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test123 {
	
	
	
	@Test(dataProvider="getData",dataProviderClass=Demo4.class)
	public void createUser(String un,int pwd){
		Reporter.log(un+"   "+pwd,true);
	}

	
////	@DataProvider
//	public Object[][] getData(){
//		
//		Object[][] data=new Object[4][2];
//		data[0][0]="ismail";
//		data[0][1]=123;
//		data[1][0]="dipu";
//		data[1][1]=123;
//		data[2][0]="ismail";
//		data[2][1]=123;
//		data[3][0]="dipu";
//		data[3][1]=123;
//		
//		return data;
//		
//		
//	}
}
