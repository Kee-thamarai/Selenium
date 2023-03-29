package radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating webdriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://demo.guru99.com/test/radio.html");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		//Checkbox 1 is selected
		check1.click();
		System.out.println("Check box1 selected successfully!!!");
		WebElement check3 = driver.findElement(By.id("vfb-6-2"));
		//Checkbox 3 is selected
		check3.click();
		System.out.println("Check box3 selected successfully!!!");
		//Terminating browser
		driver.close();
		System.out.println("Check box's are selected successfully!!!");

	}

}
