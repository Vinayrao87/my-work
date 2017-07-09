package Practice1;

import org.testng.annotations.DataProvider;

public class Demo4 {
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data=new Object[2][2];
		data[0][0]="ismail";
		data[0][1]=123;
		data[1][0]="dipu";
		data[1][1]=123;
		
		return data;
		
		
	}
	
	
	
}
