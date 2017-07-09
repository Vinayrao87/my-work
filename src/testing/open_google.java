package testing;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class open_google {
	
	
	public static void main (String args[])
	
	{
	WebDriver driver= new FirefoxDriver();
	
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}


