package signup_testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import signup_pages.fakemail_page;
import signup_pages.login_page;
import signup_pages.templates_page;
import signup_pages.verification_page;
import utilities.read_excel;

public class Signup_test extends Base_test {
	
	
 
	 login_page log ;
	 fakemail_page fake ;
	 templates_page temp ;
	 verification_page ver ;
	
	 @Test(priority =1)
	 public void signup () throws Exception {
		 
		 fake = new fakemail_page (base_page_driver) ; 
		 fake.copy_email();
		 temp = new templates_page (base_page_driver) ;
		 temp.open_new_tab();
		 temp.select_template();
		 temp.signup_page();
		 fake.open_fakemail();
		 ver = new verification_page (base_page_driver) ;
		 ver.get_started();
		 ver.get_branding_text();
	 }
	 /*
  @Test (dataProvider ="test_data")
  public void login(String email , String password) throws InterruptedException  {
	  
	  
	  log = new login_page (base_page_driver) ;
	  log.check_app_owner_found();
	  log.insert_email_field(email);
	  log.insert_pass(password);
	  log.click_on_login();
	  log.get_branding_text();
	//  log.wait_branding_display();
	  log.click_on_main_app();
	  log.click_on_logout();
//	  log.insert_email2_field(email);
	//  log.insert_pass2(password);
	 // log.click_on_login();
	  
  }
  */
  @DataProvider
  public String[][]test_data() throws InvalidFormatException, IOException{
	  
	  read_excel obj = new read_excel();
	  
	 return obj.read_sheet();
	  
  }
}
