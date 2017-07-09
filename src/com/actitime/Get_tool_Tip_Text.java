package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Get_tool_Tip_Text {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement cb=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		Actions actions=new Actions(driver);
		cb.click();
		if(cb.isSelected()){
			System.out.println("checkbox is selected");
		}
		Thread.sleep(2000);
		cb.click();
		if(cb.isSelected()){
			System.out.println("checkbox is selected");
		}
		else{
			System.out.println("checkbox is not selected");
		}
		actions.moveToElement(cb).perform();
		
		String ttt=cb.getAttribute("title");
		System.out.println(ttt);

	}

}
