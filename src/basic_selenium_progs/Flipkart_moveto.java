package basic_selenium_progs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_moveto {
	
	FirefoxDriver driver;
	public void open()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement x=driver.findElement(By.xpath("//span[text()='Electronics']"));
		new Actions(driver).moveToElement(x).perform();
		driver.findElement(By.linkText("Samsung")).click();
		driver.findElement(By.id("fk-top-search-box")).sendKeys("lenovo");
		driver.findElement(By.id("fk-top-search-box")).sendKeys(Keys.ENTER);
	}
	public static void main(String [] args)
	{
		Flipkart_moveto  g= new Flipkart_moveto();
		g.open();
		
	}

}
