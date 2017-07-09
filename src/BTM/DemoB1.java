package BTM;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoB1 {
	@DataProvider
public Iterator<Object[]> getData(){
	ArrayList<Object[]> data= new ArrayList<Object[]>();
	Object[] row1={"dipu",123};
	Object[] row3={"ismail",456};
	Object[] row2={"ismail",456};
	Object[] row4={"ismail",456};
	data.add(row1);
	data.add(row2);
	data.add(row3);
	data.add(row4);
	
	return data.iterator();	
	
}
@Test(dataProvider="getData",dataProviderClass=DemoB1.class)
public void retrievedata(String un, int pwd){
	Reporter.log(un+"   "+pwd,true);
}









}
