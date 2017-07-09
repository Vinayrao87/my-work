package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");  
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		String er="actiTIME - Login";
		String ar=driver.getTitle();
		if(er.equals(ar))
		{System.out.println("pass login page is shown");
		
		}
		else
		{
			System.out.println("Fail login page is not shown");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String actuallogin= driver.getTitle();
		String expectedlogin= "actiTIME - Login";
		if(actuallogin.equals(expectedlogin))
		{
			System.out.println("PASS login is succesfull");
		}
		else
			System.out.println("FAIL login is succesfull");
	}

}
