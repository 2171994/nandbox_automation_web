package event_testcase;

//import java.io.IOException;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.w3c.dom.events.EventException;

import driver_manager.DriverManager;
import event_pages.create_event_page;
import event_pages.event_section_page;
//import event_pages.login1_page;
import event_pages.uploadeventimages;
//import event_pages.event_setting_page;
//import event_pages.login1_page;
//import event_utilities.read_excel1;
//import pages.login_page;
//import utilities.read_excel;

public class event_testcase extends DriverManager {
  
         event_section_page  sec ;
         create_event_page cre ;
         uploadeventimages upload ;
	//	event_setting_page sett;
        //  login1_page log ;
			
		  @Test (dataProvider ="test_data1")
		  public void loginn(String eventname ,String eventdescription ,String imageName) throws InterruptedException  {
			  
			  
			  sec = new event_section_page (new_driver1) ;
			  sec.click_on_event_section();
			  sec.click_on_create_event_button();
			  cre = new create_event_page(new_driver1);
			  cre.insert_event_name(eventname);
			  cre.insert_event_description(eventdescription);
			  upload = new uploadeventimages(new_driver1);
			  upload.uploadImage(imageName);
		//	  cre.select_all_days();
			  cre.location_detected();
			  cre.select_location();
		//	  cre.select_all_days();
			//  cre.click_on_save_button();
			//  Assert.assertTrue(cre.expected_payment_section_displaye().contains("Payment"));
		//	  cre.expected_payment_section_displaye() ;
			  cre.click_on_back_button();
		//	 Assert.assertEquals(sec.expected_check_event_name(), eventname);

			  
		  }
		  
		  @DataProvider(name = "test_data1")
		  public Object[][] provideTestData() {
		      return new Object[][]{
		              {"Event 1","EventDescription1","party.jpg"},
		              {"Event 2","EventDescription1","race.jpg"}
		           //   {"channel 3", "Description 3", "image3.jpg"}
		              // Add more test data with different image file names if needed
		      };
		
  }
}

