package com.actitime;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Count_duplicate {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	
		//print the occurance of each options present in list box
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium%20class/select.html");
		WebElement listBox= driver.findElement(By.id("SLV"));
		
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(WebElement option:allOptions){
			String text=option.getText();
			if(map.containsKey(text)){
				Integer count=map.get(text);
				count++;
				map.put(text,count);
			}
			else
			{
				map.put(text,1);
			}
			
			
		}
		System.out.println(map);

	}

}
