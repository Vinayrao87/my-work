package com.actitime;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMap_count_option {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium%20class/select.html");
		WebElement link=driver.findElement(By.xpath("//select[@id='SLV']"));
		Select select=new Select(link);
		
		List<WebElement> allOptions=select.getOptions();
		for(int i=0;i<allOptions.size();i++){
			select.selectByIndex(i);
		}
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(WebElement option: allOptions){
			String text=option.getText();
			if(map.containsKey(text)){
				Integer count=map.get(text);
				count++;
				map.put(text,count);
			}
			else{
				map.put(text,1);
			}
		}
		System.out.println(map);
		for( String key:map.keySet()){
			if(map.get(key)>1){
				System.out.println(key+"is duplicate");
			}
			else{
				System.out.println(key+"is not duplicate");
			}
		}
		System.out.println("To print whether duplicate or only one");
		for(WebElement option: allOptions){
			String text=option.getText();
			if(map.get(text)>1){
				System.out.println(text+"is duplicate");
			}
			else{
				System.out.println(text+"is not duplicate ");
			}
		
			
			}
		if(map.containsKey("pizza")){
			System.out.println("it contains pizza");
			
		}
		else{
			System.out.println("it does not contain pizza");
		}
		
		
		
		
		

	}

}
