package com.actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountFbLink {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count= allLinks.size();
		System.out.println(count);
		System.out.println(allLinks.get(1).getText());
	}

}
