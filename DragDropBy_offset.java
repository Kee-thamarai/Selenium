package dragdrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy_offset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting System property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating browser
		WebDriver driver = new FirefoxDriver();
	    //URL Defined
		String baseURL = "https://demoqa.com/droppable/";
	    //Launching browser
		driver.get(baseURL);
	    //Maximizing the browser
		driver.manage().window().maximize();
		//Creating object of Actions class
		Actions act = new Actions(driver);
		//Locating WebElement which needs to drag
	    WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
	    //Locating WebElement which needs to drop
	    WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));
	    //Here, getting x and y offset to drop source object on target object location
	  	//First, get x and y offset for from object
	   	int xOffset1 = from.getLocation().getX();
	  		
	  	int yOffset1 =  from.getLocation().getY();
	  		
		System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);
	  		
		//Secondly, get x and y offset for to object
	  	int xOffset = to.getLocation().getX();
	  				
		int yOffset =  to.getLocation().getY();
	  		
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and 
		//dropped
		xOffset =(xOffset-xOffset1)+20;
		yOffset=(yOffset-yOffset1)+60;
		
		//Performing the drag and drop action 
		act.dragAndDropBy(from, xOffset, yOffset).perform();
		//verify text changed in to 'Drop here' box 
		//Get text value of 'to' element
		String textTo = to.getText(); 

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped at location as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped at location as expected");
		}
		
		//Terminating the browser
		//driver.close();

	}

}
