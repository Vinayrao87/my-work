package com.actitime;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_uploadCV {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.naukri.com");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		getting all the browser handles 
		String naukriHandle=driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		String naukri_Title=driver.getTitle();
		System.out.println(driver.getTitle());
		
//		closing all the handles other than the main one
		
		for(String wh:allWHS){
			driver.switchTo().window(wh);
				if(!(driver.getTitle().equals(naukri_Title))){
						System.out.println(driver.getTitle());//printing title of other windows
						driver.close();
					}
				Thread.sleep(500);
		}
		
//		switching window handle to the main page and login to naukri
		driver.switchTo().window(naukriHandle);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.id("eLogin")).sendKeys("vinayrao56@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("9826147748");
		driver.findElement(By.xpath("//button[@class='blueBtn']")).click();
		
//		scrolling down to UpdateProfile link and then clicking
		WebElement xp_UpdateProfile = driver.findElement(By.xpath("//button[@class='w205']"));
		int x= xp_UpdateProfile.getLocation().getX();
		int y= xp_UpdateProfile.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(500);
		
		
		xp_UpdateProfile.click();
		
		WebElement xp_UploadLink = driver.findElement(By.xpath("//a[@id='uploadLink']"));
		x= xp_UploadLink.getLocation().getX();
		y= xp_UploadLink.getLocation().getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(500);
		
//		opening the upload CV popup and then selecting the file
		xp_UploadLink.click();
		File f=new File("photo/myCV.docx");
		String mycv=f.getAbsolutePath();
		System.out.println(mycv);
		driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(mycv);
		driver.findElement(By.xpath("//button[@class='w85bt fl']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//strong[.='Cancel']")).click(); //click cancel
		WebElement scrollup=driver.findElement(By.xpath("//a[@class='nLogo fl']"));
		x=scrollup.getLocation().getX();
		y=scrollup.getLocation().getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		
		
	}
}


