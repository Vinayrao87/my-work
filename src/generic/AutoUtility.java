package generic;

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

public class AutoUtility {
	
	public static void getScreenShot(String path){
		/**
		 * Get ScreenShot of Desktop
		 * @param path path of the image file
		 * @return void
		 */
		
		
		try{
		Robot r=new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
//		Rectangle screenRect=new Rectangle(0, 0, 400, 400);  we are using Toolkit class to get the size of screen
		
		
		
		Rectangle screenRect=new Rectangle(screensize);
		BufferedImage image=r.createScreenCapture(screenRect);
		ImageIO.write(image, "png",new File(path));
		}
		catch(Exception e){
			
		}	
		}
	
	
	//to get screenshot of the page
	public static void getScreenShot(WebDriver driver,String path){
		
//		we are passing the path so that it can be saved to a desire location the only problem with this is it don't take window popups photo
		
		try{
			TakesScreenshot t=(TakesScreenshot) driver;
			File image=t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(image, new File(path));
		}
		catch(Exception e){
			
		}
		
	}
	
//	this method will return the system time in dd_MM_yy_hh_mm_ss format return type is String
	public static String now(){
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_yy_hh_mm_ss");
		String timeStamp =s.format(new Date());
		return timeStamp;
	}

	
//	this method is to get the value from the text file config.properties and return the Value based on Key
	public static String getPropertyValue(String path, String key){
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

	
	
	
	
	
	

