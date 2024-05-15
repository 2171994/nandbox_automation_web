package grouup_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base1_page {
	
	protected WebDriver new_driver ;
	
	public Base1_page(WebDriver driver2)
	{
		new_driver = driver2 ;
		PageFactory.initElements(new_driver, this);
		new_driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
//public Base_page(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	//}
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
