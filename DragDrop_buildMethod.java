package dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_buildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting System property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating browser
	    WebDriver driver = new FirefoxDriver();
	    //URL Defined
	    String baseURL = "https://demo.guru99.com/test/drag_drop.html";
	    //Launching browser
	    driver.get(baseURL);
	    //Maximizing the browser
	    driver.manage().window().maximize();
	    //Locating WebElement which needs to drag
	    WebElement from_bank = driver.findElement(By.xpath("//*[contains(text(),'BANK')]"));
	    //Locating WebElement which needs to drop
	    WebElement to_account = driver.findElement(By.xpath("//*[@id='bank']"));
	    
	    //Creating object of Actions class to build composite actions  
	    Actions act = new Actions(driver);
	    
	   //Performing the drag and drop action  
	   act.dragAndDrop(from_bank, to_account).build().perform();
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println("DragDrop operations completed successfully!!!");
	   //Terminating browser
	   driver.close();

	}

}
