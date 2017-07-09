package IRCTC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
//	Declaring the driver variable globally so that it can be used throughout the class
	public WebDriver driver;
	
	
	@FindBy(id="loginbutton")
	private WebElement loginBTN;
	
	
	public LoginPage(WebDriver driver){
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	public void clickLogin(){
	loginBTN.click();
	}

	public void closeAlert(){
	driver.switchTo().alert().accept();
	}
}
