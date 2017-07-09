package com.actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {
	
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void printTable(WebElement table){
		List<WebElement> allTD = table.findElements(By.tagName("td"));
		for(WebElement td:allTD){
			System.out.println(td.getText());
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium class/table2.html");
		WebElement myTable = driver.findElement(By.id("t1"));
		printTable(myTable);
		
		
		List<WebElement> rowCount=driver.findElements(By.xpath("//table[2]//tr"));
		System.out.println("row "+rowCount.size());
		
		List<WebElement> cellCount=driver.findElements(By.xpath("//table[1]//td"));
		System.out.println("cells "+cellCount.size());
		
		List<WebElement> colCount=driver.findElements(By.xpath("//table[2]//tr[1]/td"));
		System.out.println("column "+colCount.size());
		
		driver.close();
	}

}
