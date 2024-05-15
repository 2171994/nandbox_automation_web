package signup_pages;

// import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class templates_page extends Base_page {

	public templates_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
			
	}

	
	
	
	@FindBy(xpath = "/html/body/app-app/app-auth/app-scan/app-login/div/div[3]/app-link-btn/a")
	WebElement signup ; 
	
//	@FindBy(xpath = "/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[2]/div")
//	WebElement selecttemplate ; 
	
	private By selecttemplate = By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[2]/div");
	
	private By startwithtemplate = By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/app-startover-temp-view/div/div[1]/div[1]/div[2]/div[2]");
//	@FindBy(xpath = "/html/body/app-app/app-startover/div/app-startover-questions/div/div/app-startover-temp-view/div/div[1]/div[1]/div[2]/div[2]")
//	WebElement startwithtemplate ; 
	

	@FindBy(id = "name")
     WebElement namefield ;
	
	@FindBy(xpath = "/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/div[3]/input")
	WebElement signupemailfield ;
	
	@FindBy(xpath = "/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/div[4]/input")
	WebElement signuppasswordfield ;
	
	@FindBy(xpath = "/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/button")
	WebElement signupbutton ;
	
	
	Actions actions = new Actions(base_page_driver);
	 
	
	

		public void open_new_tab () throws Exception {
		//	Thread.sleep(3000);
			//open new tab 
			Robot robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_T);
			//select second tab 
			base_page_driver.switchTo().window(base_page_driver.getWindowHandles().toArray()[1].toString());
			base_page_driver.get("https://dev1.ourpage.me/login");
		}
		
		public void select_template () throws InterruptedException {
			
	//		Thread.sleep(3000);
			signup.click();
			Thread.sleep(2000);
			wait_elements(base_page_driver , 30 ,selecttemplate) ;
			base_page_driver.findElement(selecttemplate).click();
			Thread.sleep(2000);
			wait_elements(base_page_driver , 30 ,startwithtemplate) ;
			base_page_driver.findElement(startwithtemplate).click();
			
			
			
		}
		public void signup_page () throws InterruptedException {
			
	//		Thread.sleep(3000);
			namefield.sendKeys("Omar");
			
			signupemailfield.click();
			signupemailfield.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			
			signuppasswordfield.click();
			signuppasswordfield.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			
			Thread.sleep(2000);
			signupbutton.click();
			Thread.sleep(3000);

		}
	
		
	


		
	}
	
	

