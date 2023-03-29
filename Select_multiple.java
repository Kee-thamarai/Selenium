package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating browser
		WebDriver driver = new FirefoxDriver();
		//URL Defined
		String baseURL1 = "https://output.jsbin.com/osebed/2";
		String baseURL2 = "https://demoqa.com/select-menu";
		//Launching browser
		driver.get(baseURL1);
		//Maximizing window
		driver.manage().window().maximize();
		//Locating webelements by Select class
		Select dropdown = new Select(driver.findElement(By.id("fruits")));
		//METHOD 1 with multiple() method
		//Using isMultiple() method
		if(dropdown.isMultiple()) {
		//Select by index
		dropdown.selectByIndex(1);
		//Select by visibleText
		dropdown.selectByVisibleText("Grape");
		//Select by value
		dropdown.selectByValue("orange");
		}
		System.out.println("Multiple values selected from dropdown");
		
		driver.get(baseURL2);
		Select dropdown2 = new Select(driver.findElement(By.id("oldSelectMenu")));
		//METHOD 2 without isMultiple() method
		//Select by index
		dropdown2.selectByIndex(1);
		//Select by visibleText
		dropdown2.selectByVisibleText("Yellow");
		//Slect by value
		dropdown2.selectByValue("5");
		System.out.println("Multiple value selected from dropdown2!!!");
		//Terminating browser
		driver.close();
		
		
	}

}
