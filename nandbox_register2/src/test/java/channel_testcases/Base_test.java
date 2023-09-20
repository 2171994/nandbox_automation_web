package channel_testcases;

//import java.util.ArrayList;
//import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

//import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
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
	//		  new_driver .get("https://dev5.ourpage.me/login") ;
	//		  log = new login2_page(new_driver);
	//		  log.insert_email_field();
	//		  log.insert_pass();
	//		  log.click_On_signin();
	         
		  }
		  @AfterClass
		  public void close_browser() {
			  
			//  tigoDriver.close();
			  
			  
		  }
//	uploadimage	uploadgroupimages = PageFactory.initElements(new_driver, uploadgroupimages.class);
	  // upload=  PageFactory.initElements(new_driver, this);
		     // Create a list of image paths
	 //       List<String> imagePaths = new ArrayList<String>();
	  //      imagePaths.add("path/to/image1.jpg");
	   //     imagePaths.add("path/to/image2.jpg");
	        // Add additional image paths as needed

	        // Use the Page Object method to upload images
	      
	        // Run the above line for the first image upload
	        // On subsequent test runs, this line will upload the next image in the list
  }

