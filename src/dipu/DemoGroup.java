package dipu;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoGroup {
	
	
	@BeforeMethod(alwaysRun=true)
	public void login(){
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logout(){
		Reporter.log("logout",true);
	}
	
	@Test(groups={"user","smoke"})
	public void createUser(){
	Reporter.log("createuser",true);
 	}
	@Test(groups="user")
	public void editUser(){
	Reporter.log("editUser",true);
 	}
	
	@Test(groups={"product","smoke"})
	public void createProduct(){
	Reporter.log("createProduct",true);
 	}
	@Test(groups={"product"})
	public void deleteProduct(){
	Reporter.log("deleteProduct",true);
 	}

		
	}


