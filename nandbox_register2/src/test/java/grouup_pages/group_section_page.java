package grouup_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class group_section_page extends Base1_page {
	
	


	public group_section_page(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}
	private By group_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[11]/div/div") ;
    private By create_group_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[1]/div[2]/button");
                                   //         /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span
    
    
	public void click_on_group_section () throws InterruptedException
	{
		Thread.sleep(10000);
		wait_elements (new_driver , 50 ,  group_section  );
		new_driver.findElement(group_section).click();
	}
	public void click_on_create_group_button () throws InterruptedException 
	{
		
		Thread.sleep(10000);
		wait_elements (new_driver , 50 ,  create_group_button  );
		new_driver.findElement(create_group_button).click();
	}
}
