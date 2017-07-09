package testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FW_listeners.class)
public class WBT_testing extends BaseTest_Testing {

	@Test
	public void testWBT(){
		int r=Excel1.getRownumber(EXCEL_PATH, "Sheet1");
		log.info("row count:"+r);
		
		String v=Excel1.getCellValue(EXCEL_PATH, "Sheet1", 0, 0);
		log.info("cell value:"+v);
//		Reporter.log("cell value of 1,1 :"+Excel1.getCellValue(EXCEL_PATH, "Sheet1", 1, 1),true);
//		Reporter.log("column count:"+Excel1.getColumnCount(EXCEL_PATH, "Sheet1"),true);
//		Reporter.log("row count:"+Excel1.getRownumber(EXCEL_PATH, "Sheet1"),true);
//		Excel1.setCellValue(EXCEL_PATH, "Sheet1", "tester", 1, 1);
//		
		Assert.fail();
		
//		to get value store in row 0, cell 0
//		String value=Excel1.getCellValue(EXCEL_PATH, "Sheet1", 0, 0);
//		Reporter.log(value,true);
		
//		to store in the excel file
//		Excel1.setCellValue(EXCEL_PATH, "Sheet1", "Tester", 6, 0);
//		Reporter.log(""+Excel1.getCellValue(EXCEL_PATH, "Sheet1", 6, 0),true);
	
	
////		to get the number of rows in the excel file
//		int rowcount=Excel1.getRownumber(EXCEL_PATH, "Sheet1");
//		Reporter.log(""+rowcount,true);


		
//		Reporter.log("executing WBT test",true);
//	Assert.fail();
	}
	
}
