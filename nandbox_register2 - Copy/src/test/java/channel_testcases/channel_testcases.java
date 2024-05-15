package channel_testcases;

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import channels_pages.channels_section_page;
import channels_pages.create_channel;
import channels_pages.uploadchannelimages;
import driver_manager.DriverManager;
//import group_utilities.read_excel2;
//import event_testcase.General_Base_test;

public class channel_testcases extends DriverManager {


    channels_section_page cha ;
     create_channel crea ;
     uploadchannelimages upl ;
     /*
     @Test (priority=1)
     public void loginn() throws InterruptedException {
    	 
    	  sec = new group_section_page (new_driver) ;
		  sec.click_on_group_section();
		  sec.click_on_create_group_button();s
		  cre = new create_group(new_driver);
		  cre.insert_group_name("groupname");
		  cre.insert_group_description("groupdescription");
		  cre.uploadgroupeimage();
		  cre.click_on_save_button();
		  cre.click_on_back_group_button();
     }
     */
	  @Test (dataProvider ="test_data1")
	  public void loginn(String channelname , String channeldescription ,String imageName) throws InterruptedException  {
		  
		
		  cha = new channels_section_page (new_driver1) ;
		  cha.click_on_channel_section();
		  cha.click_on_create_channel_button();
		  crea = new create_channel(new_driver1);
		  crea.insert_channel_name(channelname);
		  crea.insert_channel_description(channeldescription);
		  upl = new uploadchannelimages(new_driver1);
		  upl.uploadImage(imageName);
		  crea.click_on_save_button();
	//	  Assert.assertEquals(crea.expected_Store_section_display(), "Lo");
		  Assert.assertTrue(crea.expected_Store_section_display().contains("Store")); 
		  crea.click_on_back_channel_button();
	      Assert.assertEquals(crea.expected_name_channel_result(), channelname);  
	  	  Assert.assertEquals(crea.expected_description_channel_result(),channeldescription );
	  }

	 
@DataProvider(name = "test_data1")
public Object[][] provideTestData() {
    return new Object[][]{
            {"channel 1", "Description 1", "Doctor.jpg"},
            {"channel 2", "Description 2", "ophthalmologist.jpg"}
         //   {"channel 3", "Description 3", "image3.jpg"}
            // Add more test data with different image file names if needed
    };
}
}
/*
      // Instantiate the Page Objects
      UploadPage uploadPage = PageFactory.initElements(driver, UploadPage.class);
      
      // Create a list of image paths
      List<String> imagePaths = new ArrayList<>();
      imagePaths.add("path/to/image1.jpg");
      imagePaths.add("path/to/image2.jpg");
      // Add additional image paths as needed

      // Use the Page Object method to upload images
      uploadPage.uploadImage(imagePaths);
      // Run the above line for the first image upload
      // On subsequent test runs, this line will upload the next image in the list
	
}
	*/ 
