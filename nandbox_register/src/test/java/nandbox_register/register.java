package nandbox_register;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class register {
	WebDriver OmarDriver;
	
     @Test(dataProvider ="test_data")//babaselo al function ale gowa al DataProvider

     public void login(String email , String password) throws InterruptedException {
	
	//  WebDriverWait wait1 = new WebDriverWait(OmarDriver,30);// time in sec
	 // public void login1() throws InterruptedException {
		  Thread.sleep(3000);
		  WebDriverWait wait1 = new WebDriverWait(OmarDriver,30);// time in sec
		  //    /html/body/app-app/app-auth/app-scan/app-login/div/div[1]
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")));
		  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")).click();
		  OmarDriver.findElement(By.id("mat-input-0")).sendKeys(email);
		  OmarDriver.findElement(By.id("mat-input-1")).sendKeys(password);
		  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span")).click();
		  WebDriverWait wait = new WebDriverWait(OmarDriver,60);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
		  String branding = OmarDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
		  Assert.assertEquals(branding, "Branding");
//	  OmarDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//  OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[1]/app-nav-bar/div/div[3]/div[2]/app-profile-image/img")).click();
	 // OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[1]/app-nav-bar/div/div[3]/div[2]/ul/li/a")).click();	  
	 
	  
  }
  @BeforeClass
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
	  OmarDriver = new ChromeDriver();
	  OmarDriver.manage().window().maximize();
	  OmarDriver.get("https://dev1.ourpage.me/login");
	  
  }
 @DataProvider
  public String[][]test_data() throws InvalidFormatException, IOException{
	  
	  read_excel obj = new read_excel();
	  
	 return obj.read_sheet();
	  
  }
}
