package event_testcase;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import event_pages.login1_page;
import event_utilities.read_excel1;

public class Base_test {
	WebDriver base_page_driver ;
	login1_page log ;
	  @BeforeClass
	  public void open_browser() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
		  base_page_driver  = new ChromeDriver();
		  base_page_driver .manage().window().maximize();
		  base_page_driver .get("https://dev1.ourpage.me/login") ;
		  log = new login1_page(base_page_driver);
		  log.check_app_owner_found();
		  log.insert_email_field();
	//	  log.insert_email_field();
		  log.insert_pass();
		//  log.insert_pass();
		  log.click_on_login();
		  /*
		  Thread.sleep(3000);
		  WebDriverWait wait1 = new WebDriverWait(base_page_driver,30);// time in sec
		  //    /html/body/app-app/app-auth/app-scan/app-login/div/div[1]
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")));
		  base_page_driver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")).click();
		  base_page_driver.findElement(By.id("mat-input-0")).sendKeys("design@icelogs.com");
		  base_page_driver.findElement(By.id("mat-input-1")).sendKeys("omar1234");
		  Thread.sleep(3000);
		  base_page_driver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span")).click();
	//	  WebDriverWait wait = new WebDriverWait(base_page_driver,60);
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
		 // String branding = base_page_driver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
		 // Assert.assertEquals(branding, "Branding");
  }
  */
	  }
	  @AfterClass
	  public void close_browser() {
		  
		//  tigoDriver.close();
		  
		  
	  }
	  @DataProvider
	  public String[][]test_data() throws InvalidFormatException, IOException{
		  
		  read_excel1 obj = new read_excel1();
		  
		 return obj.read_sheet();
		  
	  }
     
}
