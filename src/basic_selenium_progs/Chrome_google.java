package basic_selenium_progs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_google 
{

public void open()
{
	System.setProperty("WebDriver.chrome.driver","F:/Selenium");
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://www.paytm.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	/*driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("selenium");;
	//driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
	driver.findElement(By.name("btnK")).click();*/
}
public static void main(String []args)
{
	Google g = new Google();
	g.open();
}
}
