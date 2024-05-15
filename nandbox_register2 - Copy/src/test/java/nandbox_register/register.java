package nandbox_register;

/*
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
public class register {
	WebDriver OmarDriver;
	
    @Test(dataProvider ="test_data")//babaselo al function ale gowa al DataProvider
 
    public void login(String email , String password) throws InterruptedException {
	     Thread.sleep(3000);
	     
	     List<WebElement> l = OmarDriver.findElements(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div"));  /// l dh varible no3o list of webelements
	 
	     if(((l.size()== 0))) {// >>> solution 
	  //  	 OmarDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 // WebDriverWait wait1 = new WebDriverWait(OmarDriver,40);// time in sec
	 // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")));
	    	 Thread.sleep(3000);
	 //   	 OmarDriver.findElement(By.name("email")).click();
	    //	 /html/body/app-app/app-auth/app-scan/app-login/div/div[2]/app-link-btn/div/div
	  //  	 OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/div[2]/app-link-btn/div/div")).click();
	    
	  OmarDriver.findElement(By.id("mat-input-2")).sendKeys(email);
	  OmarDriver.findElement(By.id("mat-input-3")).sendKeys(password);
	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span")).click();
	  WebDriverWait wait = new WebDriverWait(OmarDriver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
	  String branding = OmarDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
	  Assert.assertEquals(branding, "Branding");
	  OmarDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wait2 = new WebDriverWait(OmarDriver,50);// time in sec
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/div/div")));
	//  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")).click();//create channel button
		 Thread.sleep(4000);

	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/div/div")).click();
	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/ul/li")).click();	  
	 
          }else {
        	 // (OmarDriver.findElement(By.id("mat-input-0")).isDisplayed()) 
	     
	     
	    	 Thread.sleep(3000);
	    	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")).click();
	    	 	 Thread.sleep(3000);
	  OmarDriver.findElement(By.id("mat-input-0")).sendKeys(email);
	  OmarDriver.findElement(By.id("mat-input-1")).sendKeys(password);
	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span")).click();
	  WebDriverWait wait = new WebDriverWait(OmarDriver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
	  String branding = OmarDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
	  Assert.assertEquals(branding, "Branding");
	  OmarDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wait2 = new WebDriverWait(OmarDriver,50);// time in sec
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/div/div")));
	//  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")).click();//create channel button
		 Thread.sleep(4000);

	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/div/div")).click();
	  OmarDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/mat-toolbar/div/app-nav-bar/div/div[4]/div[2]/ul/li")).click();	  
	     
          }
  }
 // private int dynamicElement() {
	// TODO Auto-generated method stub          
	//return 0;
//}
@BeforeClass
  public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
	  OmarDriver = new ChromeDriver();
	  OmarDriver.manage().window().maximize();
	  OmarDriver.get("https://dev1.ourpage.me/login");
	  
  }
 @DataProvider
  public String[][]test_data() throws InvalidFormatException, IOException{
	  
	  read_excel obj = new read_excel();
	  
	 return obj.read_sheet();
	  
  }
}
*/
