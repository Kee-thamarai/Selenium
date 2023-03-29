package locatingStategies_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sub_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating WebDriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://www.linkedin.com/");
		//Maximizing browser
		//driver.manage().window().maximize();
		//Locating webelements by element starts with(^) substring.
		driver.findElement(By.cssSelector("input[name^='sess']")).sendKeys("kiruthikat1719@gmail.com");
		//Locating webelements by element ends with ($) substring
		//driver.findElement(By.cssSelector("input[id$='ord']")).sendKeys("Sairam043!");
		//Locating webelements by element * - substring
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("Sairam043!");
		//Locating webelements by element : contains 
		//driver.findElement(By.cssSelector("input:contains(password')")).sendKeys("Sairam043!");
		
		//Terminating browser
		driver.close();
		System.out.println("Test Passed!!!");

	}

}
