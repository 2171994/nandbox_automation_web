package store_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import grouup_pages.login2_page;
import mobile_store_pages.login3_page;

public class Base_test {

	
	protected WebDriver new_driver ;
	login3_page log ;
	
	  @BeforeClass
	  public void open_browser() throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
		  new_driver  = new ChromeDriver();
		  new_driver .manage().window().maximize();
		  new_driver .get("https://dev4.ourpage.me/login") ;
		  log = new login3_page(new_driver);
		  log.insert_email_field();
		  log.insert_pass();
		  log.click_On_signin();
         
	  }
	  @AfterClass
	  public void close_browser() {
		  
		//  tigoDriver.close();
		  
		  
	  }

}

