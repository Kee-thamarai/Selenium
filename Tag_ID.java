package locatingStategies_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tag_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating WebDriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://www.tutorialspoint.com/index.htm");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements with passing values
		driver.findElement(By.cssSelector("input#search-strings")).sendKeys("Java");
		//Terminating browser
		driver.close();
		System.out.println("Test Passed!!!");

	}

}
