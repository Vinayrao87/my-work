package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Istqb {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.istqb.in");
		WebElement xpFoundation= driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		WebElement xpEnrollment=driver.findElement(By.xpath("//span[.='ENROLLMENT']"));
		WebElement xpcorporate=driver.findElement(By.xpath("//span[.='CORPORATE ENROLLMENT']"));
		WebElement xponline=driver.findElement(By.xpath("//span[.='ONLINE ENROLLMENT']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(xpFoundation).perform();
		Thread.sleep(2000);
		actions.moveToElement(xpEnrollment).perform();
		Thread.sleep(2000);
		actions.moveToElement(xpcorporate).perform();
		Thread.sleep(2000);
		xponline.click();
	
	}

}
