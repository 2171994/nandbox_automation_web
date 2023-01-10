package booking_testcases;

import org.testng.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bookings_pages.booking_more_details_page;
import bookings_pages.booking_section_page;
import bookings_pages.create_booking_page;
import bookings_pages.create_new_schedule_booking_page;


public class booking_testcases extends Base_Test {
	
	
	
	 booking_section_page sec;
	 create_booking_page cre ;
	 create_new_schedule_booking_page sch;
	booking_more_details_page mor ;
  @Parameters({"Booking Name","Booking Description","Booking Duration","Booking gap"})
	@Test()
  
  public void f(String BookingName ,String BookingDescription,String BookingDuration,String Bookinggap) throws InterruptedException {
	  
	
	sec = new booking_section_page(mydriver) ;
    sec.click_on_booking_section();
    sec.click_on_create_booking();
    cre = new create_booking_page(mydriver);
    cre.insert_booking_name(BookingName);
	cre.insert_booking_Description(BookingDescription);
	cre.insert_booking_location();
	cre.select_booking_location();
	cre.insert_booking_duration(BookingDuration);
	cre.insert_booking_gap(Bookinggap);
	cre.click_on_booking_next_button();
	sch = new create_new_schedule_booking_page(mydriver);
	Assert.assertEquals(sch.check_create_new_schedule(), "Create New schedule" ) ;
	sch.click_on_day_toggle();
	sch.insert_start_time();
	sch.insert_end_time();
	sch.insert_number_of_bookings();
	sch.click_on_create_button();
	mor = new booking_more_details_page(mydriver);
	mor.click_on_booking_name();
	mor.click_on_more_details_button();
	Assert.assertEquals(mor.check_booking_name(), BookingName ) ;
	Assert.assertEquals(mor.check_booking_description(), BookingDescription ) ;
	//Assert.assertEquals(mor.check_booking_time_taken(), BookingDuration ) ;
	Assert.assertEquals(mor.check_booking_waiting_time(), Bookinggap ) ;
	
	 		
     }
  }

