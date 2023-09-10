package grouup_pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class login2_page extends Base1_page {


	public login2_page(WebDriver driver2) {
		super(driver2);
		
	}
//	private By wait_app_owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");
	
	private By signin_button = By.className("submit-btn"); //awl By dh abstarct class w login_button dh refrence variable no3o abstarct class
	private By email1 = By.id("email") ; // ana 3amlt al elemnet dool private 3ashan ma7dsh ya2dr yast3mlhom bara al class dh "w dh asmo encapsulation"
	private By password1  = By.id("Password");

//	private By App_Owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");

	/*
	public void check_app_owner_found() throws InterruptedException
	{
		
		wait_elements (new_driver , 50 ,wait_app_owner );
		new_driver.findElement(App_Owner).click();
	 }
	 */
	/*
	public String expected_result() throws InterruptedException {           // dh ana 3amlto badal al function ale fo2 3ashan dh more generic 
		Thread.sleep(3000);
		wait_elements (new_driver , 30 ,wait_app_owner );  // dh hna bet call function wazeftha anha testana 20 sec 
		return new_driver.findElement(wait_app_owner).getText();
		
	}
	*/
	
	public void insert_email_field()
	{
		wait_elements (new_driver , 30 ,email1 );
		new_driver.findElement(email1).sendKeys("design@icelogs.com");
	}
	public void insert_pass()
	{
		wait_elements (new_driver , 30 ,password1 );
		new_driver.findElement(password1).sendKeys("omar1234");
	}
	public void click_On_signin() throws InterruptedException
	{
		Thread.sleep(1000);
		wait_elements (new_driver , 30 ,signin_button );
		new_driver.findElement(signin_button).click();
	}
}
	
