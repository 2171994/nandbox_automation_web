package booking_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

//import bookings_pages.login3_page;
//import event_pages.login1_page;



public class Base_Test {
	
		 
		protected WebDriver new_driver1 ;
	//	login3_page log ;
		  @BeforeSuite
		  public void open_browser() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
			  new_driver1  = new ChromeDriver();
			//  new_driver1 .manage().window().maximize();
			//  new_driver1.get("https://dev5.ourpage.me/login") ;
		//	  log = new login3_page(new_driver1);
			//  log.insert_email_field();
			 // log.insert_pass() ;
			 // log.click_On_signin();
	
		  }
		  @AfterClass
		  public void close_browser() {
			  
			//  tigoDriver.close();
			  
			  
		  }

}
