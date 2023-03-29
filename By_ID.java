package locatingStategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.navigate().to("https://www.tutorialspoint.com/index.htm");
		//Maximizing window
		driver.manage().window().maximize();
		//Locating WebElements
		//Locating by id
		WebElement search = driver.findElement(By.id("search-strings"));
		//Pasing WebElement values
		search.sendKeys("Java");
		//Closing browser
		driver.close();
	    System.out.println("Test Passed!!!");

	}

}
