package com.actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium class/table1.html");
		String xp="//input[@type='checkbox']";
		List<WebElement> allCB = driver.findElements(By.xpath(xp));
		
		 int count =allCB.size();
		System.out.println(count);
		allCB.get(0).click();  //1st checkbox
		allCB.get(count-1).click(); //last checkbox
		
		int z= count-1;
		
		for(WebElement cb:allCB){ //using for each to click alternate checkbox
			if (z %2 == 0)
			cb.click();
			z--;
			Thread.sleep(500);
		}
		
		for(int i=count-1;i>=0;i--){  //click all the links in decending order
			allCB.get(i).click();
		}
	
	
	for(int i=count-1;i>=0;i-- ){    //click alternate checkbox
		if(i % 2 == 0 )
		{
			allCB.get(i).click();
			Thread.sleep(500);
		}
	}
	driver.findElements(By.xpath("//input[@type='checkbox']")).get(1).click();
	
		
	}
		
	}

