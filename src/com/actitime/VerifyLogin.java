package com.actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");  
	}
	
	public static boolean verifyTitle(WebDriver driver, String expectedTitle)
	{
		String actualTitle= driver.getTitle();
		return actualTitle.equals(expectedTitle);
	}
	public static void main(String[] args)throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
	
		if(verifyTitle(driver,"actiTIME - Login")){
			System.out.println("pass :Login page is displayed");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[.='Login ']")).click();
			Thread.sleep(3000);
			
		
			if (verifyTitle(driver,"actiTIME - Enter Time-Track"))
				{
				System.out.println("Pass home page is displayed");
				}
			else{
				System.out.println("Fail :home page is not displayed");				
			}
			
			driver.findElement(By.id("logoutLink")).click();
		
			driver.close();
		}
		
	}

}
