package testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import nandbox_register.read_excel;
import pages.login_page;
import utilities.read_excel;

public class resgister_test extends Base_test {
	
	
 
	 login_page log ;
	
	
	
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
  
  @DataProvider
  public String[][]test_data() throws InvalidFormatException, IOException{
	  
	  read_excel obj = new read_excel();
	  
	 return obj.read_sheet();
	  
  }
}
