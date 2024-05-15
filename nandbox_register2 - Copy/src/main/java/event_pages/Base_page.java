package event_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	
	protected WebDriver base_page_driver  ;
	
	public Base_page(WebDriver driver1)
	{
		base_page_driver = driver1 ;
		base_page_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(base_page_driver, this);
		
	}
	public void scroll_down (WebDriver driver1)
	  {
		  JavascriptExecutor java = (JavascriptExecutor) driver1; // bay3ml casting lel interface JavascriptExcuter le webDriver r
		   java.executeScript("scroll(0,250)")   ;               // dh basta5dmo law 3ayz a run ay 7aga feha javascript code through selenium
	  }
	  public void wait_elements (WebDriver driver1 ,int time ,By element_name)
	  {
		  WebDriverWait wait =new WebDriverWait(driver1,time);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
				  
	  }

}
