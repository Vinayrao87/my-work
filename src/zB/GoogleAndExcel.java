package zB;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testing.Constant_values;

public class GoogleAndExcel implements Constant_values{
	@Test
	public void google_excel() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
	String sITO= getITO(CONFIG_PATH, "ITO");
	Long lngITO=Long.parseLong(sITO);
	driver.manage().timeouts().implicitlyWait(lngITO , TimeUnit.SECONDS);
	
	driver.get("http://www.google.com");
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(getvalue(EXCEL_PATH, "Sheet1", 0, 0));
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.ENTER);
	
	}
	
	public String getvalue(String path,String Sheet,int r, int c){
		String value="";
		try{
			FileInputStream fis=new FileInputStream(Constant_values.EXCEL_PATH);
			Workbook wb=WorkbookFactory.create(fis);
			value=wb.getSheet("Sheet1").getRow(r).getCell(c).toString();
		}
		catch(Exception e){
			
		}
		
		return value;
	}
	public String getITO(String path,String key){
		String value="";
		try{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			value=p.getProperty(key);
		}
		catch(Exception e){
			
		}
		return value;
	
		
	}
}
