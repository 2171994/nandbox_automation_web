package mobile_store_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class store_section extends Base_page {
	
	public store_section(WebDriver driver3) {
		super(driver3);
	}
	//  /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[18]/div/div
	
	By Mbile_store_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[1]/mat-sidenav/div/app-side-menu/div[18]/div/div");
	
	//    create-btn ng-star-inserted





public void click_on_Mbile_store_section () throws InterruptedException 
{
	
	Thread.sleep(10000);
	wait_elements (new_driver , 50 ,  Mbile_store_section  );
	new_driver.findElement(Mbile_store_section).click();
}
/*
public void click_create_button () throws InterruptedException 
{
	
	Thread.sleep(3000);
	wait_elements (new_driver , 100 ,  create_button );
	new_driver.findElement(create_button).click();
}
*/

}