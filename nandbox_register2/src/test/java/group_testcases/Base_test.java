package group_testcases;

//import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

//import group_utilities.read_excel2;
import grouup_pages.login2_page;

public class Base_test {
 
		WebDriver new_driver ;
		login2_page log ;
		  @BeforeClass
		  public void open_browser() throws InterruptedException {
			
			  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
			  new_driver  = new ChromeDriver();
			  new_driver .manage().window().maximize();
			  new_driver .get("https://dev1.ourpage.me/login") ;
			  log = new login2_page(new_driver);
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

