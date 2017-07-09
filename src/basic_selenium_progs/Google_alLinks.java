package basic_selenium_progs;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_alLinks {
	FirefoxDriver driver;
	
	public void open()
	{
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);;
	List<WebElement> lst= driver.findElements(By.partialLinkText("selenium"));
	
	for(WebElement y: lst)
		System.out.println(y.getText());
	}
	
	public void links()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);;
		List<WebElement> lst= driver.findElements(By.partialLinkText("selenium"));
		
	for(WebElement y: lst)
		System.out.println(y.getText());
	}
	public static void main(String [] args)
	{
		Google_alLinks g= new Google_alLinks();
		g.open();
	//	g.links();
	}

}
