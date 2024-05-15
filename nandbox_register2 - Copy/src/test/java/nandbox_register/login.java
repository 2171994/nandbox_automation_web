package nandbox_register;



//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	
	 ChromeDriver tigoDriver ;
  @Test(priority=1)
  public void login1() throws InterruptedException {
	  Thread.sleep(3000);
	  WebDriverWait wait1 = new WebDriverWait(tigoDriver,30);// time in sec
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")));
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")).click();
	  tigoDriver.findElement(By.id("mat-input-0")).sendKeys("ali@icelogs.com");
	  tigoDriver.findElement(By.id("mat-input-1")).sendKeys("ali12345");
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/form/div[4]/app-border-btn/button/span")).click();
	  WebDriverWait wait = new WebDriverWait(tigoDriver,60);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
	  String branding = tigoDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
	  Assert.assertEquals(branding, "Branding");
	  
  }
  @Test (priority=4)
 public void create_channel() throws InterruptedException {
	//  tigoDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	  
	  
	  Thread.sleep(2000);
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[9]/div/div/div[1]")).click();//click on channels
	  Thread.sleep(2000); 
	  WebDriverWait wait2 = new WebDriverWait(tigoDriver,30);
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")));//wait create channel
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")).click();//create channel
	  tigoDriver.findElement(By.id("inputSubgroupName")).sendKeys("runchannel");//channel name
	  tigoDriver.findElement(By.id("inputDesc")).sendKeys("runchannel1");//channel description
	  WebDriverWait wait3 =new WebDriverWait(tigoDriver,20);
	  wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")));//wait create channel button 
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")).click();//create channel button
	  WebDriverWait wait4 =new WebDriverWait(tigoDriver,20);
	  wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-popup-setting-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")));//wait cancel channel button 
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-popup-setting-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")).click();//cancel channel button
	  Thread.sleep(3000);
	  String chennelname = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/div/app-sub-chat-cell[1]/app-cell-frame/div/div/div[1]/div[3]")).getText();
 	  Assert.assertEquals(chennelname, "runchannel");
 	
	  //  String channelimage = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-form-frame/div/div[2]/div[1]/div/label")).getText();
	 // Assert.assertEquals(channelimage, "Channel Image");
//	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-form-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")).click();//cancel button
	//  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-form-frame/div/div[2]/div[1]/div/app-upld-img-with-title/div/div/div/label[1]")).sendKeys("C:\\Users\\ahmed.DESCTOP_ISMAIL\\Desktop\\png");//upload image
	   
	 
  }
  @Test(priority=3)
  public void create_Group() throws InterruptedException {
	  Thread.sleep(2000);
	  tigoDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	  tigoDriver.findElement(By.xpath(" /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[11]/div/div/div[1]")).click(); //chatgroup section
	  Thread.sleep(2000);
	  WebDriverWait wait =new WebDriverWait(tigoDriver,80);
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")));//check create group is found
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")).click();// create group button 
	  tigoDriver.findElement(By.id("inputSubgroupName")).sendKeys("myautogroup");
	  tigoDriver.findElement(By.id("inputDesc")).sendKeys("myautogroup1"); 
	  WebDriverWait wait2 = new WebDriverWait(tigoDriver,40);
	   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")));//wait create group button
    tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form/form/div/app-border-btn/button/span")).click();//create group button
  
    WebDriverWait wait3 = new WebDriverWait(tigoDriver,40);
    wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-popup-setting-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")));//wait cancel button
    tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-popup-setting-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")).click();//cancel button
   
     Thread.sleep(3000);
 	  String chatgroupname = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-sub-chats/div/div/app-sub-chat-cell[1]/app-cell-frame/div/div/div[1]/div[3]")).getText();
 	  Assert.assertEquals(chatgroupname, "myautogroup");
 	//  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-sub-chats/div/app-sub-chat-form-image/app-form-frame/div/div[2]/div[2]/div/app-border-btn[2]/button/span")).click();
    
        
  }
  @Test(priority=5)
  public void create_booking() throws InterruptedException {
	  tigoDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[14]/div/div/div[1]")).click();//booking section 
	  Thread.sleep(2000);
	  WebDriverWait wait = new WebDriverWait(tigoDriver,30);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span"))); //wait creat booking
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")).click();   //create booking
	  tigoDriver.findElement(By.id("inputBookingName")).sendKeys("automatedbooking");
	  tigoDriver.findElement(By.id("inputBookingDescription")).sendKeys("automatedbooking1");
	  tigoDriver.findElement(By.id("locationInput")).sendKeys("cairo"); // booking location 
	  WebDriverWait wait2 = new WebDriverWait(tigoDriver,30);
	  Thread.sleep(2000);
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[1]")));//wait cairo ,Egypt
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[1]")).click(); // cairo ,Egypt location 
	  
	  tigoDriver.findElement(By.id("inputTimeTaken")).sendKeys("50");
	  tigoDriver.findElement(By.id("inputWaitingTime")).sendKeys("10");
	  Thread.sleep(2000);
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-form/div/form/div/app-border-btn/button/span")).click();//next button
	  Thread.sleep(2000);
	  String CreateNewService = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-subform/div/form/div/div")).getText();
	  Assert.assertEquals(CreateNewService, "Create New Service");

	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-subform/div/form/app-headerfull-frame/div/div[2]/div[3]/div/div/app-booking-available-day/div/div/div[1]/div/label/span")).click();//sunday toggle 
	
	  tigoDriver.findElement(By.id("startTimeControl-0-0")).click();
	   //   //*[@id="startTimeControl-0-0"]
	  tigoDriver.findElement(By.id("startTimeControl-0-0")).sendKeys("1010AM");
	tigoDriver.findElement(By.id("endTimeControl-0-0")).sendKeys("1010pm");
	tigoDriver.findElement(By.id("numberOfBookingsControl-0-0")).sendKeys("15");
	tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/app-booking-subform/div/form/div/app-border-btn/button/span")).click();//create button 
	Thread.sleep(3000);
	String bookingname = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-bookings/div/div/app-booking-cell[1]/app-cell-frame/div/div/div[1]/div[3]")).getText();
	Assert.assertEquals(bookingname, "automatedbooking");
	
  }
  @Test(priority=2)
  public void create_event() throws InterruptedException {
	  WebDriverWait wait = new WebDriverWait(tigoDriver,50); 
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]")));;
	  Thread.sleep(3000);
	  ///html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[16]/div/div/svg
	 ///  /html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[15]/div/div/div[1]")).click();//event section
	  Thread.sleep(2000);
	  WebDriverWait wait2 = new WebDriverWait(tigoDriver,40); 
	  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")));
	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-list-style-bar-frame/div/div/div[1]/div[2]/app-border-btn/button/span")).click();//create event
	  tigoDriver.findElement(By.id("eventNameFiled")).sendKeys("myautoevent");
	 // tigoDriver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]")).click();//All day "yes button"
	  tigoDriver.findElement(By.id("locationInput")).sendKeys("cairo");//event location
	  Thread.sleep(2000);
	 tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/app-headerfull-frame/div/div[2]/app-selector-input-location/div/div/div/div[4]")).click();//cairo festival city
                          
	  tigoDriver.findElement(By.id("inputEventDescription")).sendKeys("autoevent22");
	  Thread.sleep(3000);
	   tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form/div/form/div/app-border-btn/button/span")).click();//next button
	     
	   WebDriverWait wait3 = new WebDriverWait(tigoDriver,30);
	   wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form-image/div/div/div/img")));
	   tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-events/app-event-form-image/div/div/div/img")).click(); //back button
	  
	   Thread.sleep(2000);
	   /*  String eventimage = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-events/app-event-form-image/div/app-form-frame/div/div[2]/div[1]/div/label")).getText();
	  Assert.assertEquals(eventimage,"Event Image");
	  Assert.assertTrue(false);
	  */
	 
  }
//  @AfterMethod
  //public void failed_screenshot(ITestResult testcase_result) throws IOException {
	  
	//  if(testcase_result.getStatus()==ITestResult.FAILURE) {
		//  screen_shot.take_screenshot(tigoDriver, ".\\screenshots\\"+testcase_result.getName()+".png");
	 // }
	  
//  }//
  @Test (enabled=false)
  public void set_homemenu() throws InterruptedException {
	  Thread.sleep(3000);
	tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav/div/app-side-menu/div[4]/div/div/div[1]")).click();//Design Your App section
	Thread.sleep(3000); 
	  WebDriverWait wait = new WebDriverWait(tigoDriver,50); 
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"progress\"]/li[2]/span")));//wait until home menu 
	tigoDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[2]/span")).click();//home menu
	
	 Thread.sleep(3000);    
  
 //  tigoDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[2]/span")).click();//home menu
   
   Actions ac = new Actions(tigoDriver);
   WebDriverWait wait2 = new WebDriverWait(tigoDriver,40); 
   wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-mgmt/div/app-custom/div/app-dragable-features/div/div/app-features-sublist/div/div[3]/app-sublist-item[1]/div/div/div[1]")));// wait active channel module
   WebElement src = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-mgmt/div/app-custom/div/app-dragable-features/div/div/app-features-sublist/div/div[3]/app-sublist-item[1]/div/div/div[1] ")); //active channel module

   WebElement des = tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div/div/div/app-mgmt/div/app-custom/div/div/app-main-page-conf/div/app-form-frame/div/div[2]/app-main-page-items-container/div/div/div[2] "));//drop box of home menu 
   ac.dragAndDrop(src, des).perform();
 //tigoDriver.findElement(By.xpath("/html/body/app-app/app-dashboard/div/app-layout/mat-sidenav-container/mat-sidenav-content/div[2]/div/div/div/app-mgmt/div/app-custom/div/div/app-main-page-conf/div/app-form-frame/div/div[2]/app-main-page-items-container/div/div/div[1]/app-main-page-item-config[4]/div/div[1]/div[3]/div[2]/div[2]/img")).click();//delete store tab
  }
  
  @BeforeClass
  public void open_browser() {
	
	  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
	  tigoDriver = new ChromeDriver();
	  tigoDriver.manage().window().maximize();
	  tigoDriver.get("https://dev5.ourpage.me/login");
 //   tigoDriver.get("https://app.nandbox.com/login");
	  
  }
  @AfterClass
  public void close_browser() {
	  
	//  tigoDriver.close();
	  
	  
  }
}
