
package com.actitime;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
      public static void main (String[] args){
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver.exe";
System.setProperty(key,value); //specigy driver executable path
ChromeDriver driver=new ChromeDriver(); //open the crowser
driver.close();  //close the browser
}
}
//here . (dot) represents current java project folder
