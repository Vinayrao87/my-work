package com.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");       
	}
	public static void testAnyBrowser(WebDriver driver)throws InterruptedException {
		driver.get("http://localhost/login.do");
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(1000);
		driver.navigate().to("http://localhost/license.jsp");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		Demo3.testAnyBrowser(driver);
		
		
		WebDriver driver2= new FirefoxDriver();
		Demo3.testAnyBrowser(driver2);
		

	}

}
