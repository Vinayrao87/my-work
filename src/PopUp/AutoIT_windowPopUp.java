package PopUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT_windowPopUp {
	static{
	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Runtime.getRuntime().exec("E:\\exe_folder\\printing.exe");
		
		for(int i=0;i<3;i++){
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"p");
		
		Thread.sleep(5000);
		}

		
		driver.quit();
		Runtime.getRuntime().exec("taskkill /F /IM printing.exe");

	}

}
