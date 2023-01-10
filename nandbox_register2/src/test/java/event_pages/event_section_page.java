package event_pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class event_section_page extends Base_page {
	
public event_section_page(WebDriver driver1) {
		super(driver1);
		// TODO Auto-generated constructor stub
	}



	private By wait_event_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[14]/div/div/div[1]");
                                   //         /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]
	private By create_event_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span");
	                                      //  /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span

		public void click_on_event_section () throws InterruptedException
		{
			Thread.sleep(13000);
			wait_elements (base_page_driver , 50 ,  wait_event_section  );
			base_page_driver.findElement(wait_event_section).click();
		}
		public void click_on_create_event_button () throws InterruptedException 
		{
			
			Thread.sleep(10000);
			wait_elements (base_page_driver , 50 ,  create_event_button  );
			base_page_driver.findElement(create_event_button).click();
		}

}
