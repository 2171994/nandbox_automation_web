package nandbox_register;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

//import java.io.File;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signup2 {
	 ChromeDriver tigoDriver ;
	 @Test (priority=1)
	public void signup() throws InterruptedException, Exception {
  
		
		 Thread.sleep(5000);
	
		 WebElement element = tigoDriver.findElement(By.id("email"));
		Actions actions = new Actions(tigoDriver);
		actions.click(element).click(element).click(element).build().perform();
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_C);
		
		 Thread.sleep(3000);
		 
		   
			// Simulate the keyboard shortcut keys "Ctrl + t" to open a new tab
			 //*In this code snippet, we've created an instance of the Robot class and used its methods to simulate the "Ctrl + t" keyboard shortcut keys to open a new tab
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_T);
			
			tigoDriver.switchTo().window(tigoDriver.getWindowHandles().toArray()[1].toString());
		//	tigoDriver.get("https://dev1.ourpage.me/login");
			tigoDriver.get("https://app.nandbox.com/login");
			//   https://app.nandbox.com/login
	  
			Thread.sleep(3000);
			WebDriverWait wait0 = new WebDriverWait(tigoDriver,40);
			  wait0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/div[3]/app-link-btn/a")));
				
			  tigoDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/div[3]/app-link-btn/a")).click();
			  Thread.sleep(3000);
				WebDriverWait wait2 = new WebDriverWait(tigoDriver,40);
				  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[2]")));
					
				  tigoDriver.findElement(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[2]")).click();
				  Thread.sleep(3000);
					WebDriverWait wait4 = new WebDriverWait(tigoDriver,40);
					  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/app-startover-temp-view/div/div[1]/div[1]/div[2]/div[2]")));
						
					  tigoDriver.findElement(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/app-startover-temp-view/div/div[1]/div[1]/div[2]/div[2]")).click();
			
					  Thread.sleep(3000);
			  WebDriverWait wait11 = new WebDriverWait(tigoDriver,40);// time in sec
			  wait11.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		
			  tigoDriver.findElement(By.id("name")).sendKeys("omar");
			  Thread.sleep(3000);
			  WebElement pasteElement =	tigoDriver.findElement(By.xpath("/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/div[3]/input"));
			  pasteElement.click();
			  pasteElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			  WebElement pastepassworElement =	tigoDriver.findElement(By.xpath("/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/div[4]/input"));
			  pastepassworElement.click();
			  pastepassworElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));
			  tigoDriver.findElement(By.xpath("/html/body/app-app/app-registration/div/app-signup/div[1]/div[2]/form/button")).click();
			  Thread.sleep(2000);
			 //    switch to fakemail
			  tigoDriver.switchTo().window(tigoDriver.getWindowHandles().toArray()[0].toString());
			     // Create an instance of the JavascriptExecutor interface
		 //       JavascriptExecutor js = (JavascriptExecutor) tigoDriver;

		        // Scroll down by a specified number of pixels
		//        js.executeScript("window.scrollBy(0,100)");

		        // Alternatively, you can scroll down to the bottom of the page
		   //     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			  Thread.sleep(2000);
			  WebDriverWait wait9 = new WebDriverWait(tigoDriver,50); //wait refresh button
			  wait9.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/a[3]"))); 
			  tigoDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/a[3]")).click(); //click on refresh button 
			  //    /html/body/div[2]/div[2]/div[1]/div[3]/a[3]
			 
			  Thread.sleep(8000);
			  WebDriverWait wait6 = new WebDriverWait(tigoDriver,150);
			  wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"schranka\"]/tr[1]"))); 
			  tigoDriver.findElement(By.xpath("//*[@id=\"schranka\"]/tr[1]")).click();
			  
			  Thread.sleep(6000);
			  WebElement iframe = tigoDriver.findElement(By.id("iframeMail"));
			  tigoDriver.switchTo().frame(iframe);
			  WebElement code = tigoDriver.findElement(By.id("code-div"));
			  
				Actions actionss = new Actions(tigoDriver);
				actionss.click(code).click(code).build().perform();
				  Robot robott = new Robot();
				  robott.keyPress(KeyEvent.VK_CONTROL);
					robott.keyPress(KeyEvent.VK_C);
					robott.keyRelease(KeyEvent.VK_CONTROL);
					robott.keyRelease(KeyEvent.VK_C);
   			  		tigoDriver.switchTo().window(tigoDriver.getWindowHandles().toArray()[1].toString());
   			  	Thread.sleep(3000);
					  WebElement pastecodeElement =	tigoDriver.findElement(By.xpath("//*[@id=\"1\"]"));
					  pastecodeElement.click();
					  pastecodeElement.sendKeys(Keys.chord(Keys.CONTROL, "v"));
					  Thread.sleep(3000);
					  tigoDriver.findElement(By.xpath("/html/body/app-app/app-verify-account/div/form/button")).click();
					  
					  WebDriverWait wait = new WebDriverWait(tigoDriver,60);
					  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
					  String branding = tigoDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
					  Assert.assertEquals(branding, "Branding");
					  
					  
					  
				      
					
					
		//   	  
			  // //*[@id="schranka"]/tr[1]
	 }
		  
	
	/*
  @Test (enabled =false)
  public void sign_up() throws InterruptedException {
	  ChromeDriver tigodriver = getDriver();
	  tigodriver.findElement(By.linkText("Sign Up")).click();
	  WebDriverWait wait1 = new WebDriverWait(tigodriver,20);// time in sec
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[7]/div/div[1]/img")));
	  tigodriver.findElement(By.xpath("/html/body/app-app/app-startover/div/app-startover-questions/div/div/div/app-startover-temps/div/div/div/div[2]/app-startover-temp-item[7]/div/div[1]/img")).click();
	  tigodriver.findElement(By.id("mat-input-0")).sendKeys("Omar");
        WebDriverWait wait2 = new WebDriverWait(tigodriver,20);
	    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.className("Start with this template ")));
	  tigodriver.findElement(By.className("Start with this template ")).click();
	//  tigodriver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]/div")).click();//select your country
	 // tigodriver.findElement(By.xpath("//*[@id=\"mat-option-96\"]/span")).click(); //india
	 tigodriver.findElement(By.id("mat-input-1")).sendKeys("tigoo@orperfect.com");
	 tigodriver.findElement(By.id("mat-input-2")).sendKeys("tigoo@orperfect.com");
	 tigodriver.findElement(By.xpath("//*[@id=\"inputRem\"]/label/span/div")).click();
	tigodriver.findElement(By.xpath("/html/body/app-app/app-registration/app-signup/div/form/div[5]/app-border-btn/button/span")).click();
	//WebDriverWait wait = new WebDriverWait(tigodriver , 20) ;
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-app/app-registration/app-signup/app-verify-account/div/form/div[2]/app-border-btn/button/span")));
	tigodriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  String GetStarted = tigodriver.findElement(By.xpath("/html/body/app-app/app-registration/app-signup/app-verify-account/div/form/div[2]/app-border-btn/button/span")).getText();
	  Assert.assertEquals(	GetStarted, "Get Started");
	 
  }
   */
  @BeforeClass
  public void open_browser() {
	 // ChromeDriver tigodriver = getDriver();
	 // tigodriver = Chromedriver.Chrome(options=chrome_options)

	  System.setProperty("webdriver.chrome.driver", ".\\chrome7_driver\\chromedriver.exe");
	  tigoDriver = new ChromeDriver();
	  tigoDriver.manage().window().maximize();
	  tigoDriver.get("https://www.fakemail.net/");
 //   tigoDriver.get("https://app.nandbox.com/login");
  //  tigodriver.get("https://app.nandbox.com/login");
	  
  }
  /*
   *     import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CurrentUrl{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://dev1.ourpage.me/app";
      driver.get(url);
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      // get current URL and print
      String strUrl = driver.getCurrentUrl();
      System.out.println("Current Url is:"+ strUrl);
      driver.quit();
   }
}
   */
	  
  
}
