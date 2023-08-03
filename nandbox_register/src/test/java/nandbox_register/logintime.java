package nandbox_register;

//import java.io.File;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class logintime {
	 ChromeDriver tigoDriver ;
	 @Test (priority=1)
	public void login() throws InterruptedException {
      // Thread.sleep(3000);
		  WebDriverWait wait1 = new WebDriverWait(tigoDriver,30);// time in sec
	//   /html/body/app-app/app-auth/app-scan/app-login/div/div[1]
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	//	  tigoDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/div/div[2]/app-link-btn/div")).click();
		  tigoDriver.findElement(By.id("email")).sendKeys("ali@icelogs.com");
		  tigoDriver.findElement(By.id("Password")).sendKeys("ali12345");
		//  Thread.sleep(3000);
		  // Get the current timestamp in milliseconds before clicking the login button
	        long startTime = System.currentTimeMillis();
	     // Click the login button
		  tigoDriver.findElement(By.xpath("/html/body/app-app/app-auth/app-scan/app-login/div/div[2]/form/button")).click();
		  
	        // Get the current timestamp in milliseconds after the login process is complete
		  WebDriverWait wait = new WebDriverWait(tigoDriver,60);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"progress\"]/li[1]/span")));
		  String branding = tigoDriver.findElement(By.xpath("//*[@id=\"progress\"]/li[1]/span")).getText();
		  Assert.assertEquals(branding, "Branding");
	        long endTime = System.currentTimeMillis();
	     

	        // Calculate the elapsed time in seconds
	        double elapsedTime = (endTime - startTime) / 1000.0;

	        // Print the elapsed time
	        System.out.println("Login time: " + elapsedTime + " seconds");
		  
		  
		  
		  
		  
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
	  tigoDriver.get("https://dev1.ourpage.me/login");
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
