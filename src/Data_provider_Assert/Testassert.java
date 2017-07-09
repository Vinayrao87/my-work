package Data_provider_Assert;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testassert {
@DataProvider	
public Iterator<Object[]> getData(){
	ArrayList<Object[]> data=new ArrayList<Object[]>();
	Object[] row1={"dipu",123};
	Object[] row2={"ismail",456};
	data.add(row1);
	data.add(row2);
	return data.iterator();
}

@Parameters({"username","passwd"})
@Test(groups="cricket")
public void m1(String u,String p){
	Reporter.log(u+"   "+p,true);
}

@Test(groups="cricket")
public void m2(){
	Reporter.log("cricket",true);
}



@Test(groups="football")
public void m3(){
	Reporter.log("football",true);
}

@Test(groups="football")
public void m4(){
	Reporter.log("football",true);
}


}
