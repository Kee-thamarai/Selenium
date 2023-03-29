package handling_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirmation_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system proprty
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Insatantiating browser
		WebDriver driver = new FirefoxDriver();
		//URL Defined
		String baseURL = "https://www.hyrtutorials.com/p/alertsdemo.html";
		//Launching URL
		driver.get(baseURL);
		//maximizing browser
		driver.manage().window().maximize();
		//Locating Webelements
		driver.findElement(By.id("confirmBox")).click();
		//Confirmation Alert
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		Thread.sleep(2000);
		confirmAlert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Terminating browser
		driver.close();
		
		
		

	}

}
