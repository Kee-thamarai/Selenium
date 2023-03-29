package locatingStategies_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tag_CLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating WebDriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://www.javatpoint.com/");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements by tag and class with passing values
		driver.findElement(By.cssSelector("input.gsc-input")).sendKeys("Java");
		//Terminating browser
		driver.close();
		System.out.println("Test Passed!!!");
	}

}
