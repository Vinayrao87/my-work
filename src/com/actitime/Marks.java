package com.actitime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marks {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Desktop/selenium%20class/table3.html");
		
		List<WebElement> allTD = driver.findElements(By.xpath("//tr[position()>1 and position()< last()]/td[last()]"));
		
		int sum=0;
		for(WebElement x:allTD){
			System.out.println(x.getText());
			sum=sum+ Integer.parseInt(x.getText());
		}
		System.out.println("calculated sum:"+sum);
		
		WebElement total = driver.findElement(By.xpath("//tr[position()=last()]/td[last()]"));
		System.out.println("website total"+total.getText());
		if(Integer.parseInt(total.getText())==sum)
		{
			System.out.println("the total matches with the value");
		}
		driver.close();
	}

}
