package oops_programing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	
	FirefoxDriver driver;
	
	public void open()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void main(String[] args)
	{
		Google g = new Google();
		g.open();
	}

}
