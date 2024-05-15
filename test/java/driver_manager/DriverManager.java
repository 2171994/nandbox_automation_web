package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import event_pages.login1_page;

public class DriverManager {
	
	static login1_page log ;
	    protected static WebDriver new_driver1;
	    @BeforeSuite
	    public static WebDriver getDriver() throws InterruptedException {
	        if (new_driver1 == null) {
	            // Set up the Chrome driver
	        	System.setProperty("webdriver.chrome.driver", ".\\chrome4_driver\\chromedriver.exe");
	        	 new_driver1  = new ChromeDriver();
	       	  new_driver1 .manage().window().maximize();
	       	  new_driver1 .get("https://dev5.ourpage.me/login") ;
	       	  log = new login1_page(new_driver1);
	       	  log.insert_email_field();
	       	  log.insert_pass() ;
	     //  	  log.click_On_signin();
	        }
	        return new_driver1;
	    }

	    public static void quitDriver() {
	        if (new_driver1 != null) {
	        	new_driver1.quit();
	        	new_driver1 = null;
	        }
	    }
	}
