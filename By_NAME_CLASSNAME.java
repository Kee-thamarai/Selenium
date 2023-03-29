package locatingStategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_NAME_CLASSNAME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting System Property
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating webdriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.navigate().to("https://www.javatpoint.com/");
		//Maximizing the browser
		driver.manage().window().maximize();
		//Locating webElements
		//Located "BY_NAME"
		WebElement Text = driver.findElement(By.name("search"));
		//Located "BY_CLASSNAME"
		WebElement search = driver.findElement(By.className("gsc-search-button"));
		//Passing WebElemnt
		Text.sendKeys("Java");
		search.click();
		//Terminating the browser
		driver.close();
		System.out.println("Test Passed!");
	}

}
