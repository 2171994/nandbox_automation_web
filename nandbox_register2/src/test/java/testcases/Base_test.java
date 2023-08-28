package testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import nandbox_register.read_excel;

public class Base_test {
	WebDriver base_page_driver ;
	  @BeforeClass
	  public void open_browser() {
		
		  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
		  base_page_driver  = new ChromeDriver();
		  base_page_driver .manage().window().maximize();
		  base_page_driver .get("https://www.fakemail.net/");
		//  base_page_driver .get("https://dev1.ourpage.me/login");
  }
	  @AfterClass
	  public void close_browser() {
		  
		//  tigoDriver.close();
		  
		  
	  }
	  @DataProvider
	  public String[][]test_data() throws InvalidFormatException, IOException{
		  
		  read_excel obj = new read_excel();
		  
		 return obj.read_sheet();
		  
	  }
     
}
