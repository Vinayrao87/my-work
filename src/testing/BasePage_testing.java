package testing;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage_testing implements Constant_values {
//	This is the main Base Page of all the POM Classes which will be Extended by other POM classes
//	for every page we will hava a POM class, But we will have only one BasePage
	public WebDriver driver;
	public WebDriverWait wait;
	public long  lngETO;
	public Logger log;
	
//	we are using the constructor to initialize
	public BasePage_testing(WebDriver driver){
		this.driver=driver;
		String strETO = AutoUtility1.getPropertyValue(CONFIG_PATH, "ETO");
		lngETO=Long.parseLong(strETO);
		wait=new WebDriverWait(driver,lngETO);
		log=Logger.getLogger(this.getClass());
	}
	
	public void verifyTitle(String eTitle){
		log.info("Expected title is:"+eTitle);
		try{
			wait.until(ExpectedConditions.titleIs(eTitle));
	log.info("Title is matching");	
	}
	catch(Exception e){
		String aTitle=driver.getTitle();
		log.info("Title not matching :"+aTitle);
		Assert.fail();
	}
}
	public void verifyElementIsPresent(WebElement element){
		try{
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Element is Present");
		}
		catch (Exception e){
			log.info("Element is not Present");
		}
	}
		
}