package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_contextClick {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vinayrao56");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A4b3c2d1.");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		WebElement link=driver.findElement(By.xpath("//div[@id=':2z']"));
		Actions actions=new Actions(driver);
		actions.contextClick(link).perform();
		driver.findElement(By.xpath("//div[.='Mark as read' and @class='J-N-Jz']")).click();

	}

}
