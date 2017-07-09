package com.actitime;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_dimension_cookies_position {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Dimension d=new Dimension(200,300);
		driver.manage().window().setSize(d);
		Point p=new Point(300,100);
		driver.manage().window().setPosition(p);

	}

}
