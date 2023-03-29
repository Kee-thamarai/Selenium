package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_By_VIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system proprty
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instatiating driver
		WebDriver driver = new FirefoxDriver();
		//Launchng browser
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//Maximizing browser
		driver.manage().window().maximize();
		//Locating webelements
		driver.findElement(By.name("firstName")).sendKeys("Kiruthika");
		driver.findElement(By.name("lastName")).sendKeys("Thamarai");
		driver.findElement(By.name("phone")).sendKeys("9444553999");
		driver.findElement(By.id("userName")).sendKeys("kiruthikat1719@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("No:18/28,Anjugam Nagar");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("6000019");
		//Using Select class for selecting value from dropdown  
		Select dropdown = new Select(driver.findElement(By.name("country")));
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("ALGERIA");
		dropdown.selectByVisibleText("ANTARCTICA");
		System.out.println("Value selected from dropdown successfully");
		driver.findElement(By.name("email")).sendKeys("Kiru");
		driver.findElement(By.name("password")).sendKeys("Sairam444");
		driver.findElement(By.name("confirmPassword")).sendKeys("Sairam444");
		driver.findElement(By.name("submit")).click();
		//Terminating browser
		driver.close();
		System.out.println("Test Passed!!!");
		

	}

}
