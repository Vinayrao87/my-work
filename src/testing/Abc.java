package testing;

import org.testng.annotations.Test;

import generic.Excel;
import generic.IAutoConst;

public class Abc {
//	@Test
	public void ab(){
	int count=Excel.getRowCount(IAutoConst.INPUT_PATH,"Sheet1");
	System.out.println(count);
	}

}
