package booking_testcases;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import booking_testcases.Base_Test;
import bookings_pages.booking_more_details_page;
import bookings_pages.booking_section_page;
import bookings_pages.create_booking_page;

import bookings_pages.uploadbookingimages;
import driver_manager.DriverManager;
//import event_testcase.General_Base_test;


public class booking_testcases extends DriverManager  {
	  

//	    public void setup() {
	        // Set the system property for ChromeDriver
	//    	System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");

	        // Initialize the WebDriver object
	  //      new_driver1 = new ChromeDriver();
	
	    //}
	 booking_section_page secc ;
	 create_booking_page cree ;

	booking_more_details_page mor ;
	uploadbookingimages upl ;
  //@Parameters({"Booking Name","Booking Description","Booking Duration","Booking gap"})
	@Test(dataProvider ="test_data1")
  public void booking (String BookingName ,String BookingDescription,String BookingDuration,String Bookinggap,String imagebookingName) throws InterruptedException {
	  
	
	  secc = new booking_section_page(new_driver1) ;
	  secc.click_on_booking_section();
	  secc.click_on_create_booking();
	  cree = new create_booking_page(new_driver1);
	  cree.insert_booking_name(BookingName);
	  cree.insert_booking_Description(BookingDescription);
	  cree.insert_booking_location();
	  cree.select_booking_location();
	  cree.insert_booking_duration(BookingDuration);
	  cree.insert_booking_gap(Bookinggap);
	  upl =new uploadbookingimages(new_driver1);
	  upl.uploadImage(imagebookingName);
	 cree.insert_booking_name(BookingName);
	 cree.insert_booking_Description(BookingDescription);
	 cree.insert_booking_duration(BookingDuration);
	 cree.insert_booking_duration(BookingDuration);
	 cree.insert_booking_gap(Bookinggap);
	 
	  Assert.assertEquals(secc.expected_booking_name(), BookingName ) ;
	
	//Assert.assertEquals(sch.check_create_new_schedule(), "Create New schedule" ) ;
	//sch.click_on_day_toggle();
	//sch.insert_start_time();
	//sch.insert_end_time();
	//sch.insert_number_of_bookings();
	//sch.click_on_create_button();
	//mor = new booking_more_details_page(mydriver);
	//mor.click_on_booking_name();
	//mor.click_on_more_details_button();
//	Assert.assertEquals(mor.check_booking_name(), BookingName ) ;
//	Assert.assertEquals(mor.check_booking_description(), BookingDescription ) ;
	//Assert.assertEquals(mor.check_booking_time_taken(), BookingDuration ) ;
//	Assert.assertEquals(mor.check_booking_waiting_time(), Bookinggap ) ;
	
	 		
     }
  @DataProvider(name = "test_data1")
  public Object[][] provideTestData() {
      return new Object[][]{
              {"Booking 1","BookingDescription1","60","15","doctor.jpg"},
              {"Booking 2","BookingDescription2","45","10","lesson.jpg"}
           //   {"channel 3", "Description 3", "image3.jpg"}
              // Add more test data with different image file names if needed
      };
  }
}

