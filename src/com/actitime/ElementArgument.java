package com.actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementArgument {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void printMatching(WebElement table){
	List<WebElement> allTD= table.findElements(By.tagName("td"));
	
	for(WebElement y:allTD){
		System.out.println(y.getText());
	}
}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium class/table4.html");
		WebElement mytable=driver.findElement(By.id("t2"));
		String xpath="//tr[position()>1 and position()<last()]//td[last()]";
		printMatching(mytable);
		

	}

}
