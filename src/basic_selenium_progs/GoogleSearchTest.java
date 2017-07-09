package basic_selenium_progs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {
	
	public static void main(String[]args) {
		
		WebDriver driver  = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		
		//this will get the title from the page
		String appTitle = driver.getTitle();
		System.out.println("Application title is :: "+driver.getTitle());
		
		                  //or
		System.out.println("Application title is :: "+appTitle);
		
		driver.quit();
	}

}