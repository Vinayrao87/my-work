package com.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(css="#username")
	private WebElement userNameTXB;
	
	@FindBy(name="pwd")
	private WebElement passwordTXB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	//intialization
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void setUserName(String un){
		userNameTXB.sendKeys(un);
	}
	public void setPassword(String pw){
		passwordTXB.sendKeys(pw);
	}
	
	public void clickLogin(){
		loginBTN.click();
	}

}
