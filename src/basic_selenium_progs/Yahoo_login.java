package basic_selenium_progs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo_login {
	FirefoxDriver driver;
	
	public void open()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoomail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("login-signup")).click();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("vinay");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("raoo");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("vajjalavinay");
		driver.findElement(By.id("usernamereg-password")).sendKeys("abcd1234.12");
		new Select(driver.findElement(By.xpath(".//*[@id='regform']/div[3]/div[2]/div/select"))).selectByValue("IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("98261545457545");
		new Select(driver.findElement(By.id("usernamereg-month"))).selectByValue("3");
		new Select(driver.findElement(By.id("usernamereg-day"))).selectByValue("12");
		new Select(driver.findElement(By.id("usernamereg-year"))).selectByValue("1987");
		new Select(driver.findElement(By.id("usernamereg-gender"))).selectByValue("male");
	}
	public void create()
	{
		driver.findElement(By.id("login-signup")).click();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("vinay");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("raoo");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("vajjalavinay");
		driver.findElement(By.id("usernamereg-password")).sendKeys("abcd1234.12");
		new Select(driver.findElement(By.xpath(".//*[@id='regform']/div[3]/div[2]/div/select"))).selectByValue("IN");
		driver.findElement(By.id("usernamereg-phone")).sendKeys("98261545457545");
		new Select(driver.findElement(By.id("usernamereg-month"))).selectByValue("3");
		new Select(driver.findElement(By.id("usernamereg-day"))).selectByValue("12");
		new Select(driver.findElement(By.id("usernamereg-year"))).selectByValue("1987");
		new Select(driver.findElement(By.id("usernamereg-gender"))).selectByValue("male");
		
	}
	public static void main(String [] args)
	{
		Yahoo_login g= new Yahoo_login();
		g.open();
		//g.create();
	}

}
