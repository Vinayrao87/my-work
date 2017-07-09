package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_demo {
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium%20class/java_script.html");
		
		//handling disabled element
		JavascriptExecutor j=(JavascriptExecutor) driver;
		String s="document.getElementById('t1').value='prakash'";
		j.executeScript(s);
		//remove value ofa text box using selenium
		driver.findElement(By.id("t2")).clear();
		//remove value ofa text box using JS
		String s2="document.getElementById('t3').value=''";
		j.executeScript(s2);
		//change value of a text box using selenium
		driver.findElement(By.id("t4")).clear();
		driver.findElement(By.id("t4")).sendKeys("prakash");
		//change value of a text box using JS
		
		String s3="document.getElementById('t5').value='Praksh'";
		j.executeScript(s3);

	}

}
