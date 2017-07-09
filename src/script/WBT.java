package script;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.AutoUtility;
import generic.BaseTest;
import generic.Excel;


public class WBT extends BaseTest {
	

	@Test
	public void testWBT() {
	
//	We give the logger argument as the same class name
//	Logger log=Logger.getLogger("WBT");
	
	int r=Excel.getRowCount(INPUT_PATH,"Sheet1");
	log.info("Row count:"+r);
		
	String v=Excel.getCellValue(INPUT_PATH,"Sheet1",0,0);
	log.info("Cell value:"+v);
	

	Assert.fail();
	}

}
