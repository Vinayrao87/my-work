package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trycatch {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	//check if the page is loaded with in 3 ses
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(0, TimeUnit.SECONDS);
	try{
		driver.get("http://localhost/login.do");
		System.out.println("Pass");
	}
	catch(TimeoutException e){
		System.out.println("Fail");
	}
	}

}
