package nandbox_register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class signup {
	 ChromeDriver tigodriver;
  @Test
  public void sign_up() {
	 
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
  
  @BeforeClass
  public void open_browser() {
	  
	  System.setProperty("webdriver.chrome.driver", ".\\chrome3_driver\\chromedriver.exe");
	  tigodriver = new ChromeDriver();
	  tigodriver.manage().window().maximize();
	  tigodriver.get("https://dev5.ourpage.me/login");
  //  tigodriver.get("https://app.nandbox.com/login");
	  
  }
  
	  
  
}
