package basic_selenium_progs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {
	
	FirefoxDriver driver;
	
	public void open()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.id("Email")).sendKeys("vinayrao56");
		//driver.findElement(By.id("next")).click();
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.findElement(By.id("FirstName")).sendKeys("vinay");
		driver.findElement(By.id("LastName")).sendKeys("rao");
		driver.findElement(By.id("GmailAddress")).sendKeys("vinayrao8988");
		driver.findElement(By.id("Passwd")).sendKeys("9826147748abc.");
		driver.findElement(By.id("PasswdAgain")).sendKeys("9826147748abc.");
	//	driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
	//	new Select(driver.findElement(By.xpath(".//*[@id='BirthMonth']/div"))).selectByVisibleText("March");
		driver.findElement(By.id("BirthDay")).sendKeys("12");
		driver.findElement(By.id("BirthYear")).sendKeys("1987");
		//driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
		//new Select(driver.findElement(By.xpath(".//*[@id='Gender']/div"))).selectByVisibleText("Male");
	//	new Select(driver.findElement(By.className("goog-inline-block goog-flat-menu-button jfk-select"))).selectByVisibleText("Male");
		
		
		
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9826147748");
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("vinayrao56@gmail.com");
	//	new Select(driver.findElement(By.id(":h"))).selectByVisibleText("Hong Kong");
				

	}
	public void search()
	{
		
	}
	public static void main(String []args)
	{
		Google g = new Google();
		g.open();
		//g.search();
	}

}
