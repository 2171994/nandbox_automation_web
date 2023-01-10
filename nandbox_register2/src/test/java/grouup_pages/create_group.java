package grouup_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class create_group extends Base1_page {

	public create_group(WebDriver driver2) {
		super(driver2);
	}
	
	private By group_name = By.id("inputSubgroupName");
	private By group_description = By.id("inputDesc");
	private By create_group2_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span");
	// 
	private By cancel_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-sub-chat-form-image/app-popup-setting-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span");
    private By check_group_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/div/app-sub-chat-cell[1]/app-cell-frame/div/div/div[1]/div[3]");
    private By check_description_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/div/app-sub-chat-cell[1]/app-cell-frame/div/div/div[1]/div[5]/div");
    
    
	public void insert_group_name(String groupname) throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (new_driver , 50 ,  group_name  );
		new_driver.findElement(group_name).sendKeys(groupname);
	}
	public void insert_group_description(String descriptionname) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  group_description  );
		new_driver.findElement(group_description).sendKeys(descriptionname);
	}
	public void click_on_create_group_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  create_group2_button  );
		new_driver.findElement(create_group2_button).click();
	}
	public void click_on_cancel_group_button() throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (new_driver , 50 ,  cancel_button  );
		new_driver.findElement(cancel_button).click();
	}
	public String expected_name_group_result()
	{
		wait_elements (new_driver , 100 ,  check_group_name  );
		return new_driver.findElement(check_group_name).getText();
	}
	public String expected_description_group_result()
	{
		wait_elements (new_driver , 100 ,  check_description_name  );
		return new_driver.findElement(check_description_name).getText();
   }
}
