package testing;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class AutoUtility1 {
	
	
	public static void getScreenShot(String path){
		try{
		Robot r=new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect=new Rectangle(screensize);
		BufferedImage image = r.createScreenCapture(screenRect);
		ImageIO.write(image, "png", new File(path));
		
		}
		catch (Exception e){
			
		}
		
	}
	
	public static void getScreenShot(WebDriver driver,String path){
		try{
		TakesScreenshot t=(TakesScreenshot) driver;
		File image = t.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(image,new File( path));
		}
		catch(Exception e){
			
		}
	}
	
	public static String now(){
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String timeStamp=s.format(new Date());
		return timeStamp;
		
	}
	
	
	public static String getPropertyValue(String path,String key){
		String value="";
		try
		{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		value=p.getProperty(key);
		}
		catch(Exception e){
			
		}
		return value;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
