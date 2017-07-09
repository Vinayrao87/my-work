package practiceAtHome;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(css="username")
	private WebElement userNameTXB;
	
	@FindBy(name="pwd")
	private WebElement passwordTXB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void setuserName(String un){
		userNameTXB.sendKeys(un);
	}
	
	public void setpassword(String ps){
		passwordTXB.sendKeys(ps);
	}
	
	public void clickLogin(){
		loginBTN.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//declaration
	
//	private WebElement userNameTXB;
//	private WebElement passwordTXB;
//	private WebElement loginBTN;
//	
//	
//	
//	public LoginPage(WebDriver driver){
//		userNameTXB=driver.findElement(By.id("username"));
//		passwordTXB=driver.findElement(By.name("pwd"));
//		loginBTN=driver.findElement(By.id("loginButton"));
//	}
	

	
	
	
	
}
