package IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestIRCTC {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://www.irctc.co.in");
	//creating an object of loginPage and passing driver argument
	LoginPage l= new LoginPage(driver);
	l.clickLogin();
	Thread.sleep(1000);
	l.closeAlert();
	driver.navigate().refresh();
	
	Thread.sleep(1000);
	l.clickLogin();
	Thread.sleep(1000);
	l.closeAlert();

	}

}
