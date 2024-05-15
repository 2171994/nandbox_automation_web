package bookings_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class booking_more_details_page extends Base_page {

	public booking_more_details_page(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}
	
	private By booking_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/div/div/app-booking-cell/app-cell-frame/div/div/div[1]/div[3]");
	private By more_details_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/div/div/app-booking-cell/app-cell-frame/div/div/div[2]/div[4]/div");
	private By check_booking_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/div/app-list-cards-frame/div/div[1]/div[2]/app-booking-cell/app-cell-frame/div/div[2]/div");
	private By check_booking_description = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-modal-container/div/app-booking-card/app-card-frame/div/div[2]/app-text-labelled/div/div[1]/div[2]");
	private By check_booking_waiting_time = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-modal-container/div/app-booking-card/app-card-frame/div/div[2]/app-text-labelled/div/div[6]/div[2]");
	private By booking_time_taken = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/app-modal-container/div/app-booking-card/app-card-frame/div/div[2]/app-text-labelled/div/div[7]/div[2]");
	public void click_on_booking_name() throws InterruptedException
	{
		Thread.sleep(7000);
		wait_elements (mydriver , 70 ,  booking_name  );
		mydriver.findElement(booking_name).click();
	}
	public void click_on_more_details_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  more_details_button  );
		mydriver.findElement(more_details_button).click();
	}
	public String check_booking_name() throws InterruptedException
	{
		Thread.sleep(10000);
  		wait_elements (mydriver , 100 ,  check_booking_name  );
  	return	mydriver.findElement(check_booking_name).getText();
  	
	}
	public String check_booking_description() throws InterruptedException
	{
		Thread.sleep(10000);
  		wait_elements (mydriver , 100 ,  check_booking_description  );
  	return	mydriver.findElement(check_booking_description).getText();
  	
	}
	public String check_booking_waiting_time() throws InterruptedException
	{
		Thread.sleep(10000);
  		wait_elements (mydriver , 100 ,  check_booking_waiting_time  );
  	return	mydriver.findElement(check_booking_waiting_time).getText();
  	
	}
	public String check_booking_time_taken() throws InterruptedException
	{
		Thread.sleep(10000);
  		wait_elements (mydriver , 100 ,  booking_time_taken  );
  	return	mydriver.findElement(booking_time_taken).getText();
  	
	}
}
