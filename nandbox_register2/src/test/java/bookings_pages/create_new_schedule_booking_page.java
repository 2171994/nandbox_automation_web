package bookings_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class create_new_schedule_booking_page extends Base_page {

	public create_new_schedule_booking_page(WebDriver driver2) {
		super(driver2);
		
	}
   private By day_toggle =By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-booking-subform/div/form/app-headerfull-frame/div/div[2]/div[3]/div/div/app-booking-available-day/div/div/div[1]/div/label/span");
   private By start_time = By.id("startTimeControl-0-0");
   private By end_time = By.id("endTimeControl-0-0");
   private By number_of_booking = By.id("numberOfBookingsControl-0-0");
   private By create_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-booking-subform/div/form/div/app-border-btn/button/span");
   private By create_new_schedule = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-booking-subform/div/form/div/div");
 	
   
   
   public String check_create_new_schedule() throws InterruptedException
  	{
  		Thread.sleep(15000);
  		wait_elements (mydriver , 100 ,  create_new_schedule  );
  	return	mydriver.findElement(create_new_schedule).getText();
  	}
   public void click_on_day_toggle() throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (mydriver , 50 ,  day_toggle  );
		mydriver.findElement(day_toggle).click();
	}
   public void insert_start_time() throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (mydriver , 50 ,  start_time  );
		mydriver.findElement(start_time).sendKeys("1010AM");
	}
   public void insert_end_time() throws InterruptedException
  	{
  		Thread.sleep(5000);
  		wait_elements (mydriver , 50 ,  end_time  );
  		mydriver.findElement(end_time).sendKeys("1010pm");
  	}
   public void insert_number_of_bookings() throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (mydriver , 50 ,  number_of_booking  );
		mydriver.findElement(number_of_booking).sendKeys("15");
	}
   public void click_on_create_button() throws InterruptedException
 	{
 		Thread.sleep(5000);
 		wait_elements (mydriver , 50 ,  create_button  );
 		mydriver.findElement(create_button).click();
 	}
}
