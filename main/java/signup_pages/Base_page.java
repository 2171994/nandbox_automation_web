package signup_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	protected WebDriver base_page_driver; // ana leh 3amlt al webDriver dh protected 3ashan only classes ale btenherit mn al class dh haya alee tshofo fakd (base_page_driver)
	
  public Base_page (WebDriver driver ){  //constructor 
		
		base_page_driver = driver ;
		PageFactory.initElements(base_page_driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
  public void scroll_down (WebDriver driver)
  {
	  JavascriptExecutor java = (JavascriptExecutor) driver; // bay3ml casting lel interface JavascriptExcuter le webDriver r
	   java.executeScript("scroll(0,250)")   ;               // dh basta5dmo law 3ayz a run ay 7aga feha javascript code through selenium
  }
  public void wait_elements (WebDriver driver ,int time ,By element_name)
  {
	  WebDriverWait wait =new WebDriverWait(driver,time);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
			  
  }
  /*
    public void  WebDriverWait (WebDriver driver, int i ,WebElement element) {
		// TODO Auto-generated method stub
	//	# Create a WebDriverWait instance with a specified timeout
		WebDriverWait	wait1 = WebDriverWait(driver, 10, element) ; //# Wait for a maximum of 10 seconds

	//	# Use the wait instance to wait until the element is visible
		wait1.until(EC.visibility_of(element)) ; 

  
  }
  */
}
