package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.IAutoConst;

public class ReadingFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		//this is for opening the excel file 
		FileInputStream fis=new FileInputStream(IAutoConst.INPUT_PATH);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//go to sheet1
		Sheet s=wb.getSheet("Sheet1");
		
		//go to row1
		Row r=s.getRow(0);
		
		//go to 1st cell
		
		Cell c=r.getCell(0);
		
		//get the value
		String v=c.getStringCellValue();
		System.out.println(v);
		
		
		
		//now to write the data
		String val="doctor";
		c.setCellValue(val);
	
		//save it 
		
		FileOutputStream fos=new FileOutputStream(IAutoConst.INPUT_PATH);
		wb.write(fos);
		
		//close it
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
