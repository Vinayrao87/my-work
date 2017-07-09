package com.actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_example {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t=(TakesScreenshot) driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		File destFile= new File("E:/google.png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
