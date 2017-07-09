package Data_provider_Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTXB;
	
	public LoginPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		unTXB.sendKeys(un);
	}
	public String getUserName(){
		return unTXB.getAttribute("value");
	}

}
