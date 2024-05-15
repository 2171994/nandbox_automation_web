package store_testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import mobile_store_pages.create_store_page;
import mobile_store_pages.store_section;

public class store_testcases extends Base_test {
	
	
	
	create_store_page crea ;
	store_section sec ;
	
	
	@Test()
	public void login() throws InterruptedException {
		
		sec = new store_section(new_driver) ;
		sec.click_on_Mbile_store_section();
	//	sec.click_create_button();
		crea = new create_store_page(new_driver) ;
		
		  if (crea.isElementDisplayed()) {
		        Assert.assertEquals(crea.create_default_store(), "Default Store");

		        
		    } else {
		        Assert.assertEquals(crea.create_store(), "Set As Default Store");

		    }
		}

		   
		}
		
		//crea = new create_store_page(new_driver);
	    
	
	//	crea.expected_home_screen();
		
	


