package signup_pages;

//import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
// org.openqa.selenium : package 
public class login_page extends Base_page {

  public login_page(WebDriver driver) {
		super(driver);
		
	}

	private By wait_app_owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");
	
	private By login_button = By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span"); //awl By dh abstarct class w login_button dh refrence variable no3o abstarct class
	private By email1 = By.id("mat-input-0") ; // ana 3amlt al elemnet dool private 3ashan ma7dsh ya2dr yast3mlhom bara al class dh "w dh asmo encapsulation"
	private By password1  = By.id("mat-input-1");
	private By email2 = By.id("mat-input-2");
	private By password2 = By.id("mat-input-3");
	private By mainapp = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/div/div");
	private By logout = By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/ul/li") ;
	private By branding = By.xpath("//*[@id=\"progress\"]/li[1]/span");
	//    //*[@id="progress"]/li[1]/span
	private By App_Owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");
	// email w password w login_button w wait_app_owner kool dool refrence variables w no3hom web element 
     

	// public void wait_app_owner(WebDriver driver ,int time )
	//{
		//WebDriverWait wait1 = new WebDriverWait(driver, time);// time in sec
	//	wait1.until(ExpectedConditions.elementToBeClickable(wait_app_owner)).click();
		//    /html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div
	//}
	
	
	
	public void check_app_owner_found()
	{
		// List<WebElement> l = base_page_driver.findElements(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div"));  /// l dh varible no3o list of webelements
		 
	  //   if(((l.size()== 0)))){
		wait_elements (base_page_driver , 30 ,wait_app_owner );
		base_page_driver.findElement(App_Owner).click();
	     }
	
	public String expected_result() throws InterruptedException {           // dh ana 3amlto badal al function ale fo2 3ashan dh more generic 
		Thread.sleep(3000);
		wait_elements (base_page_driver , 30 ,wait_app_owner );  // dh hna bet call function wazeftha anha testana 20 sec 
		return base_page_driver.findElement(wait_app_owner).getText();
		
	}
	
	public void insert_email_field(String email)
	{
		wait_elements (base_page_driver , 30 ,email1 );
		base_page_driver.findElement(email1).sendKeys(email);
	}
	public void insert_pass(String password)
	{
		wait_elements (base_page_driver , 30 ,password1 );
		base_page_driver.findElement(password1).sendKeys(password);
	}
	public void click_on_login()
	{
		wait_elements (base_page_driver , 30 ,login_button );
		base_page_driver.findElement(login_button).click();
	}
	public void click_on_main_app() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (base_page_driver , 40 ,mainapp );
		base_page_driver.findElement(mainapp).click();
	}
	public void click_on_logout()
	{
		wait_elements (base_page_driver , 20 ,logout );
		base_page_driver.findElement(logout).click();
	}
	public void get_branding_text()
	{
		wait_elements (base_page_driver , 40 ,branding );
	String brandingg =	 base_page_driver.findElement(branding).getText() ;
		Assert.assertEquals(brandingg , "Branding");
	}
	public void wait_branding_display() {
		wait_elements (base_page_driver , 40 ,branding );
		//Assert.assertEquals(branding, "Branding");
	}
	public void insert_email2_field(String email) throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (base_page_driver , 40 ,email2 );
		base_page_driver.findElement(email2).sendKeys(email);
	}
	public void insert_pass2(String password)
	{
		wait_elements (base_page_driver , 40 ,password2 );
		base_page_driver.findElement(password2).sendKeys(password);
	}
	
}
