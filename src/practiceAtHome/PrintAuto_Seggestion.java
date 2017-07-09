package practiceAtHome;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintAuto_Seggestion {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");//open the browser
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );//implicit wait for 10 sec this will wait for findElement/s
		
		driver.findElement(By.id("lst-ib")).sendKeys("java");  //enter java in searchbox
		
List<WebElement> allAST = driver.findElements(By.xpath("//div[contains(text(),'java')]"));//save the address of all suggestion

		System.out.println(allAST.size());//print the count of auto-seggestion present
		
		
		for(WebElement option:allAST){
			String text= option.getText();
			System.out.println(text);
		}
//		allAST.get(allAST.size()-1).click(); //click the last suggestion
	
//		THIS IS TO PRINT THE AUTO SEGGESTION IN FLIPKART WITH KEYWORD "PHILLIPS"
		
//		driver.get("http://www.flipkart.com");
//		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("philips");
//		Thread.sleep(10000);
//		List<WebElement> allAST = driver.findElements(By.xpath("//form[@class='_1WMLwI header-form-search']//ul/li//a"));
//		ArrayList<String> allText=new ArrayList<String>();
//		for(WebElement x:allAST){
//			allText.add(x.getText());
//			}
//		for(String text:allText){
//			System.out.println(text);
//		}
//			System.out.println("total no. of auto seggestion=>> "+allAST.size());
//	allAST.get(4).click();
	
	}
		
	}


