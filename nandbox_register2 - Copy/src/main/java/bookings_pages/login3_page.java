package bookings_pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class login3_page extends Base_page {


	public login3_page(WebDriver driver2) {
		super(driver2);
		
	}
	


//		private By wait_app_owner = By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div");
		
		private By signin_button = By.className("submit-btn"); //awl By dh abstarct class w login_button dh refrence variable no3o abstarct class
		private By email1 = By.id("email") ; // ana 3amlt al elemnet dool private 3ashan ma7dsh ya2dr yast3mlhom bara al class dh "w dh asmo encapsulation"
		private By password1  = By.id("Password");


		
		public void insert_email_field()
		{
			wait_elements (mydriver , 30 ,email1 );
			mydriver.findElement(email1).sendKeys("design@icelogs.com");
		}
		public void insert_pass()
		{
			wait_elements (mydriver , 30 ,password1 );
			mydriver.findElement(password1).sendKeys("omar1234");
		}
		public void click_On_signin() throws InterruptedException
		{
			Thread.sleep(1000);
			wait_elements (mydriver , 30 ,signin_button );
			mydriver.findElement(signin_button).click();
		}
}
	
