package locatingStategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_tagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.navigate().to("https://www.linkedin.com/login/");
		//Maximizing window
		driver.manage().window().maximize();
		//Locating WebElements
		//Locating by id
		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		//Locating by tagname
		WebElement button = driver.findElement(By.tagName("button"));
		//Pasing WebElement values
		email.sendKeys("kiruthikat1719@gmail.com");
		password.sendKeys("Sairam043!");
		button.click();
		//Closing browser
		driver.close();
		System.out.println("Test Passed!!!");

	}

}
