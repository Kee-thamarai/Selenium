package radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_isSelected {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating webdriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://demo.guru99.com/test/facebook.html");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements
		WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys("kiruthikat1719@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.clear();
		password.sendKeys("Sairam123!!!");
		//Checkbox slection by isSelected() method
		WebElement checkbox = driver.findElement(By.id("persist_box"));										
		checkbox.click (); 			
        System.out.println("Facebook Persists Checkbox Status is -  "+checkbox.isSelected());							
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
		//Terminating browser
		driver.close();
		

	}

}
