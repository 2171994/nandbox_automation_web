package mobile_store_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
	
	protected WebDriver new_driver ;
	
	public Base_page(WebDriver driver3)
	{
		new_driver = driver3 ;
		PageFactory.initElements(new_driver, this);
		new_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	  public void wait_elements (WebDriver driver3 ,int time ,By element_name)
	  {
		  WebDriverWait wait = new WebDriverWait(driver3,time);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
				  
	  }

}
