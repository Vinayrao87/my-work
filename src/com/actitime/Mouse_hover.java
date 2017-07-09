package com.actitime;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.actimind.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement menu=driver.findElement(By.xpath("//span[.='About Company']"));
		Actions actions=new Actions(driver);
		
		actions.moveToElement(menu).perform();
	//	driver.findElement(By.linkText("Basic Facts")).click();
		ArrayList<String> allText=new ArrayList<String>();
		List<WebElement> allOptions=new ArrayList<WebElement>();
		allOptions=driver.findElements(By.xpath("//span[.='About Company']/../..//li/a"));
		
		for(WebElement option: allOptions){
			String text=option.getText();
			System.out.println(text);
		}

	}

}
