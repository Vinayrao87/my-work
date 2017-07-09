package Data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_softassert {

	@Test
	public void  testLogin1(){
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		String aTitle=driver.getTitle();
		String eTitle="actiTIME - Logi";
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle,eTitle);
		driver.close();
		s.assertAll();
	}
//	SoftAssert wont fail the test method it is used where less imp things are to be checked
//	if want it to behave like assert then we need to write a command s.assertAll().Then it will
//	fail the test in case of failure.commands below assertall are not executed.so must be written at last.
//	soft assert is non static class
	
	public void testLogin2(){
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		String aTitle=driver.getTitle();
		String eTitle="actiTIME - Logi";
		Assert.assertEquals(aTitle, eTitle);
		driver.close();
		
		
	}
//	Assert will stop the execution in case of failure so should be written in basic and critical TC.
//	Assert is  static class. No need to create object
	
}
