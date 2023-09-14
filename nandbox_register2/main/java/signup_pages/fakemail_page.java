package signup_pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class fakemail_page extends Base_page {

	public fakemail_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "email")
    WebElement EmailField ;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/a[3]")
    WebElement refreshbutton ;
	
	@FindBy(id = "iframeMail")
    WebElement iframe ;
	
	@FindBy(id = "code-div")
    WebElement code ;
	
	@FindBy(xpath="//*[@id=\"schranka\"]/tr[1]")
	WebElement noreplay;
	//  //*[@id=\"schranka\"]/tr[1]
	
	
	Actions actions = new Actions(base_page_driver);
	
	public void copy_email () throws AWTException, InterruptedException {
	//	Thread.sleep(2000);
		Robot robot = new Robot();
	//	Actions actions = new Actions(base_page_driver);
		actions.click(EmailField).click(EmailField).click(EmailField).build().perform();
	   
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
	}

	   public void open_fakemail () throws InterruptedException, AWTException {
		   
		   Thread.sleep(2000);
			 //    switch to fakemail "first tab"
		   base_page_driver.switchTo().window(base_page_driver.getWindowHandles().toArray()[0].toString());
		   
		   if (refreshbutton.isDisplayed()) {
			   Thread.sleep(2000);
			   refreshbutton.click();
			   Thread.sleep(4000);
			   noreplay.click();
			   
		   }else {
			   Thread.sleep(12000);
			   noreplay.click();
		   }
		   
		   Thread.sleep(2000);
		   base_page_driver.switchTo().frame(iframe);
		   actions.click(code).click(code).build().perform();
		   
		   Robot robott = new Robot();
			  robott.keyPress(KeyEvent.VK_CONTROL);
				robott.keyPress(KeyEvent.VK_C);
				robott.keyRelease(KeyEvent.VK_CONTROL);
				robott.keyRelease(KeyEvent.VK_C);
				Thread.sleep(2000);
				base_page_driver.switchTo().window(base_page_driver.getWindowHandles().toArray()[1].toString());
		
				Thread.sleep(3000);
	   }
	

	
}
