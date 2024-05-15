package bookings_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class create_booking_page extends Base_page {

	public create_booking_page(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}
	
	
	private By booking_name = By.id("inputBookingName");
	private By booking_descripition = By.id("inputBookingDescription");
	private By booking_location = By.id("locationInput");
	private By select_booking_location = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-booking-form/div/form/div[1]/div[2]/div[4]/app-abstract-item-form/label/div/app-selector-input-location/div/div/div/div[2]");
	private By Time_Slot_duration = By.id("inputTimeTaken");
	private By booking_gap = By.id("inputWaitingTime");
	private By day_toggle =By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-booking-form/div/form/div[2]/div[2]/div[5]/app-abstract-item-form/div/div/app-booking-available-day/div/div/div[1]/div/label");
    private By start_time = By.id("startTimeControl-0-0");
    private By end_time = By.id("endTimeControl-0-0");
	private By number_of_booking = By.id("numberOfBookingsControl-0-0");
	private By max_bookings_per_suer = By.id("MaxBookingsPerUser-0-0");
	private By booking_save_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-booking-form/div/form/button");
	private By payement_section =By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-event-form/div/form/div[3]/div/app-abstract-item-form/label");
	private By back_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-booking-form/div/img");
	
	public void insert_booking_name(String BookingName) throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (mydriver , 50 ,  booking_name  );
		mydriver.findElement(booking_name).sendKeys(BookingName);
	}
	public void insert_booking_Description(String BookingDescription) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  booking_descripition  );
		mydriver.findElement(booking_descripition).sendKeys(BookingDescription);
	}
	public void insert_booking_location() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  booking_location  );
		mydriver.findElement(booking_location).sendKeys("cairo");
	}
	public void select_booking_location() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  select_booking_location  );
		mydriver.findElement(select_booking_location).click();
	}
	public void insert_booking_duration(String BookingDuration) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  Time_Slot_duration  );	
		mydriver.findElement(Time_Slot_duration).sendKeys(BookingDuration);
	}
	public void insert_booking_gap(String Bookinggap) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  booking_gap  );
		mydriver.findElement(booking_gap).sendKeys(Bookinggap);
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
	   public void insert_booking_per_time_slot() throws InterruptedException
		{
			Thread.sleep(5000);
			wait_elements (mydriver , 50 ,  number_of_booking  );
			mydriver.findElement(number_of_booking).sendKeys("15");
		}
	   public void insert_max_bookings_per_user() throws InterruptedException
	  	{
	  		Thread.sleep(5000);
	  		wait_elements (mydriver , 50 ,  max_bookings_per_suer  );
	  		mydriver.findElement(max_bookings_per_suer).sendKeys("10");
	  	}
	public void click_on_booking_save_button() throws InterruptedException
	{
		 scroll_down ( mydriver);
		Thread.sleep(2000);
		wait_elements (mydriver , 50 ,  booking_save_button  );
		mydriver.findElement(booking_save_button).click();
	}
	public String expected_payment_section_display()
	{
		wait_elements (mydriver , 80 ,  payement_section  );
		return mydriver.findElement(payement_section).getText();
	}
	public void click_on_back_button() throws InterruptedException 
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  back_button  );
		mydriver.findElement(back_button).click();
	}
}
