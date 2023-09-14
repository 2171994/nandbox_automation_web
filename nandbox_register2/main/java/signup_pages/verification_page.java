package signup_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class verification_page extends Base_page {

	public verification_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 
	
	@FindBy(xpath = "//*[@id=\"1\"]")
    WebElement verification_code_field  ;
	
	@FindBy(xpath = "/html/body/app-app/app-verify-account/div/form/button")
    WebElement getstarted_button  ;
	
	private By branding = By.xpath("//*[@id=\"progress\"]/li[1]/span") ;
	
	
	
	public void  get_started () throws InterruptedException {
		
	//	Thread.sleep(2000);
		verification_code_field.click();
		verification_code_field.sendKeys(Keys.chord(Keys.CONTROL, "v")) ;
		Thread.sleep(2000) ;
		getstarted_button.click();
	}
	public void get_branding_text()
	{
		wait_elements (base_page_driver , 50 ,branding );
	String brandingg =	base_page_driver.findElement(branding).getText() ;
		Assert.assertEquals(brandingg , "Branding");
	}
	  

}
