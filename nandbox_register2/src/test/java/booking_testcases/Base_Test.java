package booking_testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import bookings_pages.login3_page;



public class Base_Test {
	
		 
		WebDriver mydriver ;
		login3_page log ;
		  @BeforeClass
		  public void open_browser() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
			  mydriver  = new ChromeDriver();
			  mydriver .manage().window().maximize();
			  mydriver .get("https://dev1.ourpage.me/login") ;
			  log = new login3_page(mydriver);
			  log.check_app_owner_found();
			  log.insert_email_field();
			  log.insert_pass();
			  log.click_on_login();
	
		  }
		  @AfterClass
		  public void close_browser() {
			  
			//  tigoDriver.close();
			  
			  
		  }

}
