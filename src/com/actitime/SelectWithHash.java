package com.actitime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWithHash {

	
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
	HashSet<String> allText=new HashSet<String>();
	
	for(int i=0;i<allOptions.size();i++){
		WebElement option=allOptions.get(i);
		String text=option.getText();
		if(!allText.add(text)){
			System.out.println(text);   //to print the duplicate one
		}
	}
	
	ArrayList<String> t=new ArrayList<String>();
	for(int i=0;i<allOptions.size();i++){
		String s=allOptions.get(i).getText();
		t.add(s);
	}
	System.out.println("-----Sorted order------");
	Collections.sort(t);
	for(String s1:t){
		System.out.println(s1);    //to print in sorted order
	}
	System.out.println("-----reverse order-----");
	for(int i=t.size()-1;i>=0;i--){
		System.out.println(t.get(i));
	}
	TreeSet<String> allText1= new TreeSet<String>();
	for(int i=0;i<allOptions.size();i++){
		String s=allOptions.get(i).getText();
		allText1.add(s);
	}
	System.out.println("using TreeSet:it dont allow duplicate & it sorts the content ");
	for(String p:allText1){
		
		System.out.println(p);
	}
	
}	
}
