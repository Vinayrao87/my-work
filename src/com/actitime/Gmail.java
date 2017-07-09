package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("vinayrao87");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		
	}

}
