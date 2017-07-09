package com.actitime;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo2 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");       
	}
	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		String url=driver.getCurrentUrl(); 
		System.out.println(url);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		String src=driver.getPageSource();
//		System.out.println(src);
		
		driver.close();
		
	}

}
