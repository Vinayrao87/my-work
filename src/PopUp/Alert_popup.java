package PopUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alert_popup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//actime login 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		
//		clicking on tasks and then click button delete selected task
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		WebElement deleteButton=driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']"));
		
//		scroll down and click delete button
		int x=deleteButton.getLocation().getX();
		int y=deleteButton.getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
		Thread.sleep(2000);
		
//		javascript alert will appear
		Alert alert= driver.switchTo().alert();
		//switch to alert & get the text & click OK
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		
		
		//select all CheckBox 
		Thread.sleep(2000);
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
		
		WebElement xp_popUp = driver.findElement(By.xpath("//div[@id='operationConfirmDialogDiv']/div"));
		System.out.println("----------------------------");		
		System.out.println(xp_popUp.getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@value='Cancel'])[3]")).click();
		
		
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		driver.findElement(By.xpath("(//td[@class='configHeaderRemoveCell'])[1]")).click();
		Alert alert2= driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement setting = driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']"));
		x=setting.getLocation().getX();
		y=setting.getLocation().getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		
		setting.click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		String r_path="photo/mylogo.png";
		File f= new File(r_path);
		String a_path=f.getAbsolutePath();
		System.out.println(a_path);
		String browse_button="//input[@name='formCustomInterfaceLogo.logo']";
		
		driver.findElement(By.xpath(browse_button)).sendKeys(a_path);
//		driver.findElement(By.xpath(browse_button)).sendKeys("F:\Selenium\workspace\com.actitime\photo\mylogo.png");
		driver.findElement(By.xpath("//input[@class='saveButton']")).click();
		driver.findElement(By.id("logoutLink")).click();
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
