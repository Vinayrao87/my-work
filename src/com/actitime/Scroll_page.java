package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_page {
	
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.news.google.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'Technology')]"));
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		String s="window.scrollBy("+x+","+y+")";
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript(s);
		

	}

}
