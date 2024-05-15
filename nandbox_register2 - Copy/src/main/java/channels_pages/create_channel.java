package channels_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class create_channel extends Base1_page {

	public create_channel(WebDriver driver2) {
		super(driver2);
	}
	
	private By channel_name = By.id("inputSubgroupName");
	private By channel_description = By.id("inputDesc");
	private By create_channel_button = By.className("create-btn ng-star-inserted");
	private By save_button = By.className("submit-form-btn");
	private By back_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/img");
    private By check_channel_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[2]/app-sub-chat-cell[1]/app-cell-frame/div/div[2]/div[1]");
    private By check_description_name = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chats/div/app-list-cards-frame/div/div[1]/div[2]/app-sub-chat-cell[1]/app-cell-frame/div/div[2]/div[2]");
    
   // private By upload_image_button  = By .xpath("//*[@id=\"inputGroupName\"]/div/div/div/label[2]/div") ;
    private By Store_setting = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/form/div[6]/div/app-abstract-item-form/label/div/div")   ;
    /*                               //    /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-sub-chat-form/div/form/div[5]/div/app-abstract-item-form/label/div/div[1]/div/div[1]
    public void uploadgroupeimage() throws InterruptedException {
		Thread.sleep(5000);
		String imageName = "mosalah.png" ;
	String imagePath = System.getProperty("user.dir") +"/channelimages/"+imageName;
	WebElement fileUploader = new_driver.findElement (By.id("image-input"));
	//     //*[@id="inputGroupName"]/div/div/div/label[1]
	fileUploader.sendKeys(imagePath); 
	Thread.sleep(3000);
	wait_elements (new_driver , 50 ,  upload_image_button  );
	new_driver.findElement(upload_image_button).click();
	
	Thread.sleep(4000);
	}
	*/
    
    
	public void insert_channel_name(String channelname) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 80 ,  channel_name  );
		new_driver.findElement(channel_name).sendKeys(channelname);
	}
	public void insert_channel_description(String descriptionname) throws InterruptedException
	{
		Thread.sleep(1000);
		wait_elements (new_driver , 50 ,  channel_description  );
		new_driver.findElement(channel_description).sendKeys(descriptionname);
	}
	
	public void click_on_create_channel_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  create_channel_button  );
		new_driver.findElement(create_channel_button).click();
	}
	public void click_on_save_button() throws InterruptedException
	{
		Thread.sleep(1000);
		wait_elements (new_driver , 50 ,  save_button  );
		new_driver.findElement(save_button).click();
	}
	public String expected_Store_section_display()
	{
		wait_elements (new_driver , 150 ,  Store_setting  );
		return new_driver.findElement(Store_setting).getText();
	}
	public void click_on_back_channel_button() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  back_button  );
		new_driver.findElement(back_button).click();
	}
	public String expected_name_channel_result() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (new_driver , 50 ,  check_channel_name  );
		return new_driver.findElement(check_channel_name).getText();
	}
	public String expected_description_channel_result()
	{
		wait_elements (new_driver , 50 ,  check_description_name  );
		return new_driver.findElement(check_description_name).getText();
   }
}
