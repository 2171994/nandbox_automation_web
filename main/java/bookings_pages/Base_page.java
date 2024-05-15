package bookings_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	
	
  protected WebDriver mydriver ;
  
  public Base_page (WebDriver driver2) 
  {
	   mydriver = driver2 ;
	   mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   PageFactory.initElements(mydriver, this);
  }
	public void scroll_down (WebDriver driver2)
	  {
		  JavascriptExecutor java = (JavascriptExecutor) driver2; // bay3ml casting lel interface JavascriptExcuter le webDriver r
		   java.executeScript("scroll(0,250)")   ;               // dh basta5dmo law 3ayz a run ay 7aga feha javascript code through selenium
	  }
	  public void wait_elements (WebDriver driver2 ,int time ,By element_name)
	  {
		  WebDriverWait wait =new WebDriverWait(driver2,time);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
				  
	  }
}
