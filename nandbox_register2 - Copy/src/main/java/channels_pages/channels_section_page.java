package channels_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class channels_section_page extends Base1_page {
	
	


	public channels_section_page(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}
	private By channels_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[10]/div/div/div[1]") ;
    private By create_channel_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[1]/div[2]/button");
                                          // /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span
    
    
	public void click_on_channel_section () throws InterruptedException
	{
		Thread.sleep(10000);
		wait_elements (new_driver , 50 ,  channels_section  );
		new_driver.findElement(channels_section).click();
	}
	public void click_on_create_channel_button () throws InterruptedException 
	{
		
		Thread.sleep(12000);
		wait_elements (new_driver , 80 ,  create_channel_button  );
		new_driver.findElement(create_channel_button).click();
	}
}
