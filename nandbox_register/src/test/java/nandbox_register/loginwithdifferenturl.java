package nandbox_register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginwithdifferenturl {
	WebDriver Driver22;
	
	@Test 
	public void draggable() throws InterruptedException {
		
	//Driver22.findElement(By.xpath
		Thread.sleep(3000);
		  WebElement source = Driver22.findElement(By.id("draggable"));
		  WebElement target = Driver22.findElement(By.id("droppable"));
		                                          
		  Actions builder = new Actions(Driver22);
		  Thread.sleep(3000);
	//	  builder.dragAndDrop(source, target).build().perform();
		  
		  
		   
		   builder.clickAndHold(source).build().perform();
		   Thread.sleep(3000);
		   builder.moveToElement(target).build().perform();
		   Thread.sleep(3000);
		// release the click on the destination element to drop the source element
		   builder.release().build().perform();
	}


@BeforeTest
public void open_browser() {
	  System.setProperty("webdriver.chrome.driver", ".\\chrome7_driver\\chromedriver.exe");
	  Driver22 = new ChromeDriver();
	  Driver22.manage().window().maximize();
	  Driver22.get("http://cookbook.seleniumacademy.com/DragDropDemo.html");
	  
}
}