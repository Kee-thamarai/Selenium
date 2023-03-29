package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_All {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating browser
		WebDriver driver = new FirefoxDriver();
		//URL Defined
		String baseURL1 = "https://output.jsbin.com/osebed/2";
		//Launching browser
		driver.get(baseURL1);
		//Maximizing window
		driver.manage().window().maximize();
		//Locating webelements by Select class
		Select dropdown = new Select(driver.findElement(By.id("fruits")));
		//Using isMultiple() method
		if(dropdown.isMultiple()) {
		//Select by index
		dropdown.selectByIndex(1);
		//Select by visibleText
		dropdown.selectByVisibleText("Grape");
		//Select by value
		dropdown.selectByValue("orange");
		}
		Thread.sleep(3000);
		System.out.println("Multiple values selected from dropdown");
		
		//To Deselect all selected options
		dropdown.deselectAll();
		Thread.sleep(2000);
		System.out.println("All values are deselected....");
				
		//Terminating browser
		//driver.close();
		System.out.println("Test case passed!!!");

	}

}
