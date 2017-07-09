package practiceAtHome;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_parentBrowser {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
		String parent_Browser = driver.getWindowHandle();
		System.out.println(parent_Browser);
		
		for(String wh:allWHS)
			{
				driver.switchTo().window(wh);
				if(!wh.equals(parent_Browser))
					{
					Thread.sleep(2000);
					driver.close();
					}
			}

		
	}

}
