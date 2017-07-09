package testing;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCssProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest_Testing implements Constant_values{
	
	public WebDriver driver;
	public String strURL;
	public long lngITO;
	public Logger log=Logger.getLogger(this.getClass());
	@BeforeSuite
	public void initialize(){
		System.setProperty(CHROME_KEY	, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp(@Optional("firefox") String browser){
		if(browser.equals("chrome")){
		driver=new ChromeDriver();
		log.info("opened in chrome browser");
		}
		else{
		driver=new FirefoxDriver();
		log.info("opening in chrome browser");
		}
		strURL = AutoUtility1.getPropertyValue(CONFIG_PATH,"URL");
		log.info("url :"+strURL);
		driver.get(strURL);
		String sITO=AutoUtility1.getPropertyValue(CONFIG_PATH, "ITO");
		lngITO = Long.parseLong(sITO);
		log.info("implecit wait:"+sITO);
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(){
		
		driver.close();
	}
	
	

}
