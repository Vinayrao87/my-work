package practiceAtHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://localhost/login.do");
		
		LoginPage l=new LoginPage(driver);
		l.setuserName("bhanu");
		l.setpassword("bhanu");
		l.clickLogin();
		
		Thread.sleep(5000);
		l.setuserName("bhanu");
		l.setpassword("bhanu");
		l.clickLogin();
		

	}

}
