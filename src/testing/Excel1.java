package testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.IAutoConst;

public class Excel1 {
	
	public static String getCellValue(String path,String sheet,int r,int c){
		String v="";
		try{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
//			Sheet s=wb.getSheet(sheet);
//			Row row=s.getRow(r);
//			String cell=row.getCell(c).toString();
//			v=cell;
		
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		
		
		catch(Exception e){
			
		}
		
		return v;
	}
	
	public static int getRownumber(String path,String sheet){
		
		int v=0;
		try{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
//			Sheet s=wb.getSheet(sheet);
//			int r=s.getLastRowNum();
			v=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e){
			
		}
		return v;
	}
	
	public static void setCellValue(String path,String sheet,String value,int r,int c){
		
		try{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
	

		wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(value);
		
//		to save it
		FileOutputStream fos=new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		
		
		}
		
		catch(Exception e){
	
		}
	}
	public static int getColumnCount(String path,String sheet){
		int cellcount=0;
		try
		{
		FileInputStream fis= new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		short cel = wb.getSheet(sheet).getRow(0).getLastCellNum();
		cellcount=cel;
		}
		catch(Exception e){
			
		}
		
		return cellcount;
		
	}
}
