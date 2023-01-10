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
	private By select_booking_location = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-booking-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[1]");
	private By booking_duration = By.id("inputTimeTaken");
	private By booking_gap = By.id("inputWaitingTime");
	private By booking_next_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-booking-form/div/form/div/app-border-btn/button/span");

	
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
		wait_elements (mydriver , 50 ,  booking_duration  );
		mydriver.findElement(booking_duration).sendKeys(BookingDuration);
	}
	public void insert_booking_gap(String Bookinggap) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  booking_gap  );
		mydriver.findElement(booking_gap).sendKeys(Bookinggap);
	}
	public void click_on_booking_next_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  booking_next_button  );
		mydriver.findElement(booking_next_button).click();
	}
	
}
