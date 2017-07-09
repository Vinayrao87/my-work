package oops_programing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Opengmail
{
static WebDriver driver;

	public static void main(String[] args) 
	{   
System.setProperties("webdriver.chrome.driver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
	}

}
