package mobile_store_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class create_store_page extends Base_page {

	public create_store_page(WebDriver driver3) {
		super(driver3);
		// TODO Auto-generated constructor stub
	}
	By create_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-mobile-workflow-store/div[1]/div/app-list-cards-frame/div/div[1]/div[1]/div[2]/button");
	By store_type = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div[1]/div") ;
//   //*[@id="mat-tab-content-0-0"]/div/div[1]/div
	By home_screen = By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div[2]/app-menu-form/div/div[1]/div[2]/div[1]/div") ;
	
	@FindBy(xpath = "/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-mobile-workflow-store/div[1]/div/app-list-cards-frame/div/div[1]/div[2]/app-empty-section/div/div[2]")
    WebElement create_your_first_store ;
	@FindBy (className ="edit")
	WebElement StoretToHover ;
	
    By save_button =By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-mobile-workflow-store/div/div[2]/app-settings-form/div/div[3]/button") ;
	By back_button = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-mobile-workflow-store/div/div[2]/app-settings-form/div/div[1]/div/div[1]/div[1]/div");
//	By empty_store_section = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-mobile-workflow-store/div[1]/div/app-list-cards-frame/div/div[1]/div[2]/app-empty-section/div/div[1]");
	
//	public boolean isElementDisplayed() {
		// TODO Auto-generated method stub
	//	return false;
//	}
	
	public boolean isElementDisplayed() {
	    try {
	    	create_your_first_store.isDisplayed();
	        return true;
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}

	
//	public  	if (isElementDisplayed()) {
		// Element is displayed
	//}
	    // Perform actions specific to the if case
	//return create_your_first_store.isDisplayed();
	//} else {
	    // Element is not displayed
	   
	public String create_default_store () throws InterruptedException
	{
	
		
		Thread.sleep(2000);
		wait_elements (new_driver , 30 ,  create_button );
		new_driver.findElement(create_button).click();
		Thread.sleep(2000);
		wait_elements (new_driver , 30 ,  store_type  );
		return new_driver.findElement(store_type).getText();
	}
	public String create_store () throws InterruptedException
	{
		
		
		Thread.sleep(2000);
		wait_elements (new_driver , 30 ,  create_button );
		new_driver.findElement(create_button).click();
		Thread.sleep(2000);
		wait_elements (new_driver , 30 ,  store_type  );
		return new_driver.findElement(store_type).getText();
	}

   
   
	public String expected_home_screen()
	{
		wait_elements (new_driver , 30 ,  home_screen  );
		return new_driver.findElement(home_screen).getText();
   }
	public void click_on_save_button() {
		wait_elements (new_driver , 30 ,  save_button  );
		new_driver.findElement(save_button).click();

	}
	public void click_back_button() throws InterruptedException {
		Thread.sleep(2000);
		wait_elements (new_driver , 30 ,  back_button  );
		new_driver.findElement(back_button).click();

	}
	
	public void click_on_store_viewdetails() {
		// Create an instance of the Actions class
		Actions actions = new Actions(new_driver);
		// Perform the hover action
		actions.moveToElement(StoretToHover).perform();
		// Click on the element after hovering
		StoretToHover.click();
	}

	

	
	

	



	
	
}

