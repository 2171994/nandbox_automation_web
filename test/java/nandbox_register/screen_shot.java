package nandbox_register;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//import org.testng.annotations.Test;

public class screen_shot {
	
    WebDriver driver;
  
  public static void take_screenshot(WebDriver driver,String screen_shot_path) throws IOException {//bta5od two parameter wa7d webdriver 
	                                                                          // al path ale 3ayz a7ot al screenshot feh  
	  TakesScreenshot scrshot = ((TakesScreenshot) driver);
	  File srcfile = scrshot.getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(srcfile,new File(screen_shot_path));
	//  FileHandler.copy(from, to);
  }
}
