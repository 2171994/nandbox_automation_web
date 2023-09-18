package bookings_pages;
/*
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
*/
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;

public class uploadbookingimages extends Base_page {

	public uploadbookingimages(WebDriver driver2) {
		super(driver2);
	}
	
	    @FindBy(id = "image-input")
	    private WebElement fileUploader;

	    @FindBy(xpath = "/html/body/app-app/app-dashboard/div/app-layout/div/mat-sidenav-container/mat-sidenav-content/div/div[2]/div/div/app-booking-form/div/form/div[1]/div[2]/div[1]/app-abstract-item-form/label/div/div[2]/app-upld-img-with-title/app-modal-container/div/div/div[3]/div/label")
	    private WebElement uploadImageButton;


	    public void uploadImage(String imagebookingName) throws InterruptedException {
	
	        String relativeImagePath =System.getProperty("user.dir")+ "/bookingimages/"+imagebookingName ;

             Thread.sleep(2000);
	        fileUploader.sendKeys(relativeImagePath);
	        Thread.sleep(3000);
	        
	        uploadImageButton.click();
	
	    }
	    
	}
	

	