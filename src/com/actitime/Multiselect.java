package com.actitime;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dell/Desktop/selenium%20class/select.html");
	
	WebElement listBox = driver.findElement(By.id("SLV"));
	Select select= new Select(listBox);
	List<WebElement> allOptions=select.getOptions();
	int count=allOptions.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++){
		WebElement option=allOptions.get(i);
		String text=option.getText();
		System.out.println(text);
	}
	
	
	}

}
