package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_switching {
	static{
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dell/Desktop/selenium%20class/page1.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("f1");
//	WebElement f=driver.findElement(By.className("c1"));
//	driver.switchTo().frame(f);
//	driver.findElement(By.id("t2")).sendKeys("abcd");
//	driver.switchTo().defaultContent();
//	driver.findElement(By.id("t1")).sendKeys("abcd");
	
	Thread.sleep(1000);
	driver.findElement(By.id("t1")).sendKeys("abcd");
//	driver.switchTo().frame(0);
//	driver.findElement(By.id("t2")).sendKeys("1234");
	//WebElement f=driver.findElement(By.className("c1"));
	WebElement f=driver.findElement(By.className("c1"));
	driver.switchTo().frame(f);
	driver.findElement(By.id("t2")).sendKeys("abcd");
	Thread.sleep(1000);
	driver.findElement(By.id("t2")).clear();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).clear();
	Thread.sleep(1000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("1234");;
	}

}
