package nandbox_register;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class imageupload {
	
	
	WebDriver Driver2;
	
	@Test (enabled=false)
	public void uploadimage() throws InterruptedException {
		
		String imageName = "field-6574455__48066.jpg" ;
	String imagePath = System.getProperty("user.dir") +"/uploadimage/"+imageName;
	
	WebElement fileUploader = Driver2.findElement (By.id("file-upload"));
	Thread.sleep(3000);
	fileUploader.sendKeys(imagePath);
	Thread.sleep(3000);
	WebElement fileSubmit = Driver2.findElement (By.id("file-submit"));
	fileSubmit.click();
	}
	  @Test(priority=1)
	  public void login1() throws InterruptedException {
		  Thread.sleep(3000);
		  WebDriverWait wait1 = new WebDriverWait(Driver2,30);// time in sec
		  //    /html/body/app-app/app-auth/app-scan/app-login/div/div[1]
	//	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[1]/app-link-btn/div")));
	//	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[1]/app-link-btn/div")).click();
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		  Driver2.findElement(By.id("email")).sendKeys("ali@icelogs.com");
		  Driver2.findElement(By.id("Password")).sendKeys("ali12345");
		  Driver2.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/div[2]/form/button")).click();
		  //     //*[@id="progress"]/li[1]/span
		  WebDriverWait wait = new WebDriverWait(Driver2,60);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
		  String branding = Driver2.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
		  Assert.assertEquals(branding, "Branding");
		  Driver2.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).click();
		  
		  
		  
	  }
	@Test (priority=2)
	public void uploadprofileimage() throws InterruptedException {
		Thread.sleep(3000);
		String imageName = "mosalah.png" ;
	String imagePath = System.getProperty("user.dir") +"/uploadimage/"+imageName;
	WebElement fileUploader = Driver2.findElement (By.id("image-input"));
	fileUploader.sendKeys(imagePath);
	Thread.sleep(40000);
//	WebDriverWait wait3 = new WebDriverWait(Driver2,90);// time in sec
//	wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//	Assert.assertEquals(fileUploader, "mosalah.png");
	Driver2.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-mgmt-progress/div/div[2]/div[1]/app-header-buttons/div/button")).click();
	
	//WebElement fileSubmit = Driver2.findElement (By.id("file-submit"));
//	fileSubmit.click();
	//    /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/app-mgmt-progress/div/div[2]/div[1]/app-header-buttons/div/button
	}


@BeforeTest
public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", ".\\chrome7_driver\\chromedriver.exe");
	  Driver2 = new ChromeDriver();
	  Driver2.manage().window().maximize();
	//  Driver2.get("https://the-internet.herokuapp.com/upload");
	  Driver2.get("https://dev1.ourpage.me/login");
}
}


