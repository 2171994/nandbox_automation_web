package bookings_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class booking_section_page extends Base_page {

	public booking_section_page(WebDriver driver2) {
		super(driver2);
		
	}
	
	private By booking_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[13]/div");
	
	private By create_booking = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/div/app-list-cards-frame/div/div[1]/div[1]/div[2]/button");

	private By check_booking_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-bookings/div/app-list-cards-frame/div/div[1]/div[2]/app-booking-cell/app-cell-frame/div/div[2]/div");
	public void click_on_booking_section() throws InterruptedException
	{
		Thread.sleep(10000);
		wait_elements (mydriver , 50 ,  booking_section  );
		mydriver.findElement(booking_section).click();
	}
	public void click_on_create_booking() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 50 ,  create_booking  );
		mydriver.findElement(create_booking).click();
	}
	public String  expected_booking_name() throws InterruptedException
	{
		Thread.sleep(2000);
		wait_elements (mydriver , 100 ,  check_booking_name  );
		return mydriver.findElement(check_booking_name).getText() ;
	}
}
