package booking_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import bookings_pages.login3_page;
//import event_pages.login1_page;



public class Base_Test {
	
		 
		WebDriver mydriver ;
		login3_page log ;
		  @BeforeClass
		  public void open_browser() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
			  mydriver  = new ChromeDriver();
			  mydriver .manage().window().maximize();
			  mydriver.get("https://dev5.ourpage.me/login") ;
			  log = new login3_page(mydriver);
			  log.insert_email_field();
			  log.insert_pass() ;
			  log.click_On_signin();
	
		  }
		  @AfterClass
		  public void close_browser() {
			  
			//  tigoDriver.close();
			  
			  
		  }

}
