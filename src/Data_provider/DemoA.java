	package Data_provider;

	import org.testng.Reporter;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DemoA {
	
		@DataProvider
		public Object[][] getData(){
	Object[][] data=new Object[2][2];
	data[0][0]="UserA";
	data[0][1]=123;
	data[1][0]="UserB";
	data[1][1]=456;
	return data;
		}

//	the no. of rows will decide the no. of times the method will be
//	called and the no. argument depends on the no. of column
	@Test(dataProvider="getData")
	public void createUser(String un,int pw)
	{
	Reporter.log(un+" , "+pw);
	}
	}
