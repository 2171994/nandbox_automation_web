package group_testcases;

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import driver_manager.DriverManager;
//import group_utilities.read_excel2;
import grouup_pages.create_group;
import grouup_pages.group_section_page;
import grouup_pages.uploadgroupimages;

public class group_testcases extends DriverManager {


    group_section_page  sec ;
     create_group cre ;
     uploadgroupimages upload ;
     /*
     @Test (priority=1)
     public void loginn() throws InterruptedException {
    	 
    	  sec = new group_section_page (new_driver) ;
		  sec.click_on_group_section();
		  sec.click_on_create_group_button();
		  cre = new create_group(new_driver);
		  cre.insert_group_name("groupname");
		  cre.insert_group_description("groupdescription");
		  cre.uploadgroupeimage();
		  cre.click_on_save_button();
		  cre.click_on_back_group_button();
     }
     */
	  @Test (dataProvider ="test_data1")
	  public void loginn(String groupname , String groupdescription ,String imageName) throws InterruptedException  {
		  
		
		  sec = new group_section_page (new_driver1) ;
		  sec.click_on_group_section();
		  sec.click_on_create_group_button();
		  cre = new create_group(new_driver1);
		  cre.insert_group_name(groupname);
		  cre.insert_group_description(groupdescription);
		  upload = new uploadgroupimages(new_driver1);
		  upload.uploadImage(imageName);
		  cre.click_on_save_button();
	//	  Assert.assertTrue(cre.expected_payment_section_displaye().contains("Payment Settings")); 
	  	  cre.click_on_back_group_button();
	      Assert.assertEquals(cre.expected_name_group_result(), groupname);  
	  	  Assert.assertEquals(cre.expected_description_group_result(),groupdescription );
	  }
	  
	  
	  @DataProvider(name = "test_data1")
	  public Object[][] provideTestData() {
	      return new Object[][]{
	              {"Group 1", "Description 1", "image1.png"},
	              {"Group 2", "Description 2", "image2.jpg"},
	      //        {"Group 3", "Description 3", "image3.jpg"}
	              // Add more test data with different image file names if needed
	      };
	  }
	  }
/*
	       for (int executionCount = 0; executionCount < imagePaths.size(); executionCount++) {
	    	    List<String> imagePath = new ArrayList<String>();
	    	    imagePath.add(imagePaths.get(executionCount));
	    	    upload.uploadImage(imagePath);
	    	    
	       }
	       *//*
	       cre.click_on_save_button();
	  		  cre.click_on_back_group_button();
	  		 Assert.assertEquals(cre.expected_name_group_result(), groupname);  
	  		 Assert.assertEquals(cre.expected_description_group_result(),groupdescription );
	    	}
	  */
//	 /*   for (List<String> imagePath : imagePaths) {
	//       upload.uploadImage(imagePaths);
	       
	 //   }
	  //  */
	    /*
	    if (!imagePaths.isEmpty()) {
	    	
	        List<String> imagePath = imagePaths;
	        upload.uploadImage(imagePath);
	        
	    }
	    */
	       /*
		  cre.click_on_save_button();
		  cre.click_on_back_group_button();
		 Assert.assertEquals(cre.expected_name_group_result(), groupname);  
		 Assert.assertEquals(cre.expected_description_group_result(),groupdescription );
	    
	  }
	  */
	  /*
	  @DataProvider
	  public String[][]test_data1() throws InvalidFormatException, IOException{
		  
		  read_excel2 obj = new read_excel2();
		  
		  return obj.read_sheet();
		  
	  }
	/**/
	 

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
