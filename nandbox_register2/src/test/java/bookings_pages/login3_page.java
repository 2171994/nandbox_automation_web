package bookings_pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class login3_page extends Base_page {


	public login3_page(WebDriver driver2) {
		super(driver2);
		
	}
	private By wait_app_owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");
	
	private By login_button = By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span"); //awl By dh abstarct class w login_button dh refrence variable no3o abstarct class
	private By email1 = By.id("mat-input-0") ; // ana 3amlt al elemnet dool private 3ashan ma7dsh ya2dr yast3mlhom bara al class dh "w dh asmo encapsulation"
	private By password1  = By.id("mat-input-1");

	private By App_Owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");

	
	public void check_app_owner_found() throws InterruptedException
	{
		
		wait_elements (mydriver , 50 ,wait_app_owner );
		mydriver.findElement(App_Owner).click();
	     }
	
	public String expected_result() throws InterruptedException {           // dh ana 3amlto badal al function ale fo2 3ashan dh more generic 
		Thread.sleep(3000);
		wait_elements (mydriver , 30 ,wait_app_owner );  // dh hna bet call function wazeftha anha testana 20 sec 
		return mydriver.findElement(wait_app_owner).getText();
		
	}
	
	public void insert_email_field( )
	{
		wait_elements (mydriver , 30 ,email1 );
		mydriver.findElement(email1).sendKeys("design@icelogs.com");
	}
	public void insert_pass()
	{
		wait_elements (mydriver , 30 ,password1 );
		mydriver.findElement(password1).sendKeys("omar1234");
	}
	public void click_on_login() throws InterruptedException
	{
		Thread.sleep(3000);
		wait_elements (mydriver , 30 ,login_button );
		mydriver.findElement(login_button).click();
	}
}
	
