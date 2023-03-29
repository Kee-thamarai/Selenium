package radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating webdriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://demo.guru99.com/test/radio.html");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		//Radio button 1 is selected
		radio1.click();
		System.out.println("Radio button1 is selected successfully!!!");
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		//Radio button 1 is deselected and readio button 2 is selected
		radio2.click();
		System.out.println("Radio button1 is deselected and Radio button2 is selected successfully!!!");
		//Terminating browser
		driver.close();
		System.out.println("Radio buttons are selected and deselected successfully!!!");
		
		

	}

}
