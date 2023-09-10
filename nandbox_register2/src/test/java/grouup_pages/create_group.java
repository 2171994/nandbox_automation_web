package grouup_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class create_group extends Base1_page {

	public create_group(WebDriver driver2) {
		super(driver2);
	}
	
	private By group_name = By.id("inputSubgroupName");
	private By group_description = By.id("inputDesc");
	private By create_group2_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span");
	private By save_button = By.className("submit-form-btn");
	private By back_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/img");
    private By check_group_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[2]/app-sub-chat-cell[1]/app-cell-frame/div/div[2]/div[1]");
    private By check_description_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[2]/app-sub-chat-cell[1]/app-cell-frame/div/div[2]/div[2]");
    
    private By upload_image_button  = By .xpath("//*[@id=\"inputGroupName\"]/app-modal-container/div/div/div[3]/div/label") ;
    
    
    // /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/form/div[7]/button
    public void uploadgroupeimage() throws InterruptedException {
		Thread.sleep(5000);
		String imageName = "mosalah.png" ;
	String imagePath = System.getProperty("user.dir") +"/uploadimage1/"+imageName;
	WebElement fileUploader = new_driver.findElement (By.id("image-input"));
	//     //*[@id="inputGroupName"]/div/div/div/label[1]
	fileUploader.sendKeys(imagePath); 
	Thread.sleep(3000);
	wait_elements (new_driver , 50 ,  upload_image_button  );
	new_driver.findElement(upload_image_button).click();
	
	Thread.sleep(4000);
    }
    
	public void insert_group_name(String groupname) throws InterruptedException
	{
		Thread.sleep(5000);
		wait_elements (new_driver , 50 ,  group_name  );
		new_driver.findElement(group_name).sendKeys(groupname);
	}
	public void insert_group_description(String descriptionname) throws InterruptedException
	{
		Thread.sleep(1000);
		wait_elements (new_driver , 50 ,  group_description  );
		new_driver.findElement(group_description).sendKeys(descriptionname);
	}
	
	public void click_on_create_group_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  create_group2_button  );
		new_driver.findElement(create_group2_button).click();
	}
	public void click_on_save_button() throws InterruptedException
	{
		Thread.sleep(1000);
		wait_elements (new_driver , 50 ,  save_button  );
		new_driver.findElement(save_button).click();
	}
	public void click_on_back_group_button() throws InterruptedException
	{
		Thread.sleep(15000);
		wait_elements (new_driver , 50 ,  back_button  );
		new_driver.findElement(back_button).click();
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
