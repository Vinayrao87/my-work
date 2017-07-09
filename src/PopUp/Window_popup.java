package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_popup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
//		driver.get("http://localhost/login.do");
//		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"p");
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.CONTROL+"p");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
		
//		Runtime r=Runtime.getRuntime();
//		r.exec("E:\\calc.exe");
	}

}
