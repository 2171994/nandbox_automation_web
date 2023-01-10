package group_testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import group_utilities.read_excel2;
import grouup_pages.create_group;
import grouup_pages.group_section_page;

public class group_testcases extends Base_test {


    group_section_page  sec ;
     create_group cre ;

		
	  @Test (dataProvider ="test_data1")
	  public void loginn(String groupname , String groupdescription) throws InterruptedException  {
		  
		
		  sec = new group_section_page (new_driver) ;
		  sec.click_on_group_section();
		  sec.click_on_create_group_button();
		  cre = new create_group(new_driver);
		  cre.insert_group_name(groupname);
		  cre.insert_group_description(groupdescription);
		 cre.click_on_create_group_button();
		  cre.click_on_cancel_group_button();
		 Assert.assertEquals(cre.expected_name_group_result(), groupname);  
		 Assert.assertEquals(cre.expected_description_group_result(),groupdescription );
	  }
	  
	  @DataProvider
	  public String[][]test_data1() throws InvalidFormatException, IOException{
		  
		  read_excel2 obj = new read_excel2();
		  
		  return obj.read_sheet();
		  
	  }
	
	
	
}
