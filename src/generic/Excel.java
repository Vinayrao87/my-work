package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getCellValue(String path,String sheet,int r,int c){
		String v="";
		try{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
//			"tostring()" method will convert it to string 
			
		}
		catch(Exception e){
			
		}
		return v;
		
	}
	
	public static int getRowCount(String path, String sheet){
		
		int row=0;
		try{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			row=wb.getSheet(sheet).getLastRowNum();
//			it is used to get the no. of rows
		}
		catch(Exception e){
			
		}
		return row;
				
	}

}
