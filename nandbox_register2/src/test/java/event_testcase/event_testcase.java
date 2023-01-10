package event_testcase;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.w3c.dom.events.EventException;

import event_pages.create_event_page;
import event_pages.event_section_page;
//import event_pages.event_setting_page;
//import event_pages.login1_page;
import event_utilities.read_excel1;
//import pages.login_page;
//import utilities.read_excel;

public class event_testcase extends Base_test {
  
         event_section_page  sec ;
         create_event_page cre ;
	//	event_setting_page sett;
        //  login1_page log ;
			
		  @Test (dataProvider ="test_data")
		  public void loginn(String eventname , String eventdescription) throws InterruptedException  {
			  
			
			  sec = new event_section_page (base_page_driver) ;
			  sec.click_on_event_section();
			  sec.click_on_create_event_button();
			  cre = new create_event_page(base_page_driver);
			  cre.insert_event_name(eventname);
		//	  cre.select_all_days();
			  cre.select_location();
			  cre.location_detected();
			  cre.insert_event_description(eventdescription);
			  cre.click_on_next_button();
			  cre.click_on_back_button();
			 Assert.assertEquals(cre.expected_result(), eventname);
		     cre.click_on_first_event_name_cell();
		   	 cre.click_on_edit_first_event();
			 Assert.assertEquals(cre.expected_event_description_result(), "eventdescription1");
		//   	Assert.assertEquals(cre.check_location_detected(), "Cairo Festival City Mall, Mall، Ring Road, New Cairo 3, Egypt");
		   	 
		   	 
			// Assert.assertEquals(cre.check_event_description(), eventdescription);
			  
		  }
		  
		  @DataProvider
		  public String[][]test_data() throws InvalidFormatException, IOException{
			  
			  read_excel1 obj = new read_excel1();
			  
			  return obj.read_sheet();
			  
		  }
		
  }

