package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage l=new LoginPage(driver);
		
	
		l.setUserName("bhanu");
		
		l.setPassword("bhanu");
		l.clickLogin();
		
		Thread.sleep(5000);
		
		l.setUserName("admin");
		l.setPassword("manager");
		l.clickLogin();
		
	}

}
