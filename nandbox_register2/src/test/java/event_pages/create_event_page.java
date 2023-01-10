package event_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class create_event_page extends Base_page {

	public create_event_page(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}
		
		private By event_name = By.id("eventNameFiled");
		private By all_days = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]") ;
		//                              //*[@id="mat-radio-5"]/label/div[1]/div[1]
		private By location_field = By.id("locationInput");
		private By select_location = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[4]");
	
		private By event_description = By.id("inputEventDescription");
		//                                   inputEventDescription   
		private By event_location_of_first_cell = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/div/div/app-event-cell[1]/app-cell-frame/div/div/div[1]/div[5]/app-icon-labelled/div[2]/div[2]");
		private By next_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/div/app-border-btn/button/span") ;
		                            //     /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/div/app-border-btn/button/span
		private By back_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form-image/div/div/div/img");
		private By check_event_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/div/div/app-event-cell[1]/app-cell-frame/div/div/div[1]/div[3]");
		
		private By edit_button_of_first_cell = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/div/div/app-event-cell[1]/app-cell-frame/div/div/div[2]/div[1]/span[1]/app-edit-btn");
		public void insert_event_name(String eventname) throws InterruptedException
		{
			Thread.sleep(5000);
			wait_elements (base_page_driver , 50 ,  event_name  );
			base_page_driver.findElement(event_name).sendKeys(eventname);
		}
		public void select_all_days() throws InterruptedException
		{
			wait_elements (base_page_driver , 50 ,  all_days  );
			base_page_driver.findElement(all_days).click();
		}
		public void select_location() throws InterruptedException
		{
			wait_elements (base_page_driver , 50 ,  location_field  );
			base_page_driver.findElement(location_field).sendKeys("cairo");
		}
	
		public void location_detected() throws InterruptedException
		{
			wait_elements (base_page_driver , 50 ,  select_location  );
			base_page_driver.findElement(select_location).click();
		}
		public String check_location_detected()
		{
			wait_elements (base_page_driver , 100 ,  event_location_of_first_cell  );
			return base_page_driver.findElement(event_location_of_first_cell).getText();
		}
	
		public void insert_event_description(String eventdescription ) throws InterruptedException
		{
			wait_elements (base_page_driver , 50 ,  event_description  );
			base_page_driver.findElement(event_description).sendKeys(eventdescription);
		}
	//	public String check_event_description()
		//{
			//wait_elements (base_page_driver , 100 ,  event_description  );
			//return base_page_driver.findElement(event_description).getText();
	//	}
		public void click_on_next_button() throws InterruptedException 
		{
			Thread.sleep(5000);
			wait_elements (base_page_driver , 50 ,  next_button  );
			base_page_driver.findElement(next_button).click();
		}
		public void click_on_back_button() throws InterruptedException 
		{
			Thread.sleep(3000);
			wait_elements (base_page_driver , 50 ,  back_button  );
			base_page_driver.findElement(back_button).click();
		}
		public String expected_result()
		{
			wait_elements (base_page_driver , 100 ,  check_event_name  );
			return base_page_driver.findElement(check_event_name).getText();
		}
		public String expected_event_description_result()
		{
			wait_elements (base_page_driver , 200 ,  event_description  );
			return base_page_driver.findElement(event_description).getText();
			
		}
		public void click_on_first_event_name_cell() throws InterruptedException
		{
			Thread.sleep(2000);
			wait_elements (base_page_driver , 100 ,  check_event_name  );
			 base_page_driver.findElement(check_event_name).click();
		}
		
		 public void click_on_edit_first_event () throws InterruptedException
			{
				Thread.sleep(2000);
				wait_elements (base_page_driver , 4000 ,  edit_button_of_first_cell  );
				base_page_driver.findElement(edit_button_of_first_cell).click();
			}
		 /*
		 public String check_event_description(String eventdescription ) throws InterruptedException {
			 Thread.sleep(2000);
			 wait_elements(base_page_driver , 100 ,event_description);
			 return base_page_driver.findElement(event_description).getText();
		 }
		 */
		
		//  /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/div/div/app-event-cell[1]/app-cell-frame/div/div/div[1]/div[4]/app-event-status/div
	}

/*	
	
	  public void create_event() throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(tigoDriver,50); 
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]")));;
		  Thread.sleep(3000);
		  ///html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[16]/div/div/svg
		 ///  /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]
		  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]")).click();//event section
		  Thread.sleep(2000);
		  WebDriverWait wait2 = new WebDriverWait(tigoDriver,40); 
		  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")));
		  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")).click();//create event
		  tigoDriver.findElement(By.id("eventNameFiled")).sendKeys("myautoevent");
		 // tigoDriver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]")).click();//All day "yes button"
		  tigoDriver.findElement(By.id("locationInput")).sendKeys("cairo");//event location
		  Thread.sleep(2000);
		 tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[4]")).click();//cairo festival city
	                          
		  tigoDriver.findElement(By.id("inputEventDescription")).sendKeys("autoevent22");
		  Thread.sleep(3000);
		   tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/div/app-border-btn/button/span")).click();//next button
		     
		   WebDriverWait wait3 = new WebDriverWait(tigoDriver,30);
		   wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form-image/div/div/div/img")));
		   tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form-image/div/div/div/img")).click(); //back button
		  
		   Thread.sleep(2000);
}
*/