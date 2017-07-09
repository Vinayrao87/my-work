package test_ng_package;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Idemodel {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://accounts.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIdemodel() throws Exception {
    driver.get(baseUrl + "/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
    driver.findElement(By.linkText("Create account")).click();
    driver.findElement(By.id("FirstName")).clear();
    driver.findElement(By.id("FirstName")).sendKeys("gaga");
    driver.findElement(By.id("lastname-placeholder")).click();
    driver.findElement(By.id("LastName")).clear();
    driver.findElement(By.id("LastName")).sendKeys("aggag");
    driver.findElement(By.id("GmailAddress")).click();
    driver.findElement(By.id("GmailAddress")).clear();
    driver.findElement(By.id("GmailAddress")).sendKeys("aggag");
    driver.findElement(By.id("Passwd")).click();
    driver.findElement(By.id("Passwd")).clear();
    driver.findElement(By.id("Passwd")).sendKeys("gagagag");
    driver.findElement(By.id("PasswdAgain")).click();
    driver.findElement(By.id("PasswdAgain")).clear();
    driver.findElement(By.id("PasswdAgain")).sendKeys("aggggggggfgag");
    driver.findElement(By.id("BirthDay")).clear();
    driver.findElement(By.id("BirthDay")).sendKeys("44");
    driver.findElement(By.id("BirthYear")).clear();
    driver.findElement(By.id("BirthYear")).sendKeys("2009");
    driver.findElement(By.id("RecoveryPhoneNumber")).click();
    driver.findElement(By.id("RecoveryPhoneNumber")).clear();
    driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("+915664578784848");
    driver.findElement(By.id("RecoveryEmailAddress")).click();
    driver.findElement(By.id("RecoveryEmailAddress")).clear();
    driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("afasgahshshsdh");
    driver.findElement(By.id("SkipCaptcha")).click();
    driver.findElement(By.id("TermsOfService")).click();
    driver.findElement(By.id("submitbutton")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
