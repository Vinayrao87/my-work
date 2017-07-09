package generic;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Listeners(FWListener.class)
public class BaseTest implements IAutoConst{
	
	
	public WebDriver driver;
	public String strURL;
	public long lngITO;
	public Logger log=Logger.getLogger(this.getClass());
	
	@BeforeSuite
	public void initFrameWork()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp(@Optional("firefox") String browser){
		
		if(browser.equals("chrome")){
			driver= new ChromeDriver();
			log.info("opening Chrome Browser");
		}
		else{
			driver=new FirefoxDriver();
			log.info("opening in firefox Browser");
		}
			
		
		strURL=AutoUtility.getPropertyValue(CONFIG_PATH, "URL");
		driver.get(strURL);
		log.info("Enter the URL:"+strURL);
		
		//getting it from the config properties file using the key "ITO"
		String sITO=AutoUtility.getPropertyValue(CONFIG_PATH, "ITO");
		log.info("set ImplicititWait:"+sITO);
		
		//the implicitly wait takes the argument as long so we are converting the String into Long 
		lngITO =Long.parseLong(sITO);
	
		driver.manage().timeouts().implicitlyWait(lngITO, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(){
		driver.close();
		log.info("close the browse");
	}

}
