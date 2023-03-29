package handling_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prompt_Alert {

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
		driver.findElement(By.id("promptBox")).click();
		
		//Prompt Alert
		Alert promptAlert = driver.switchTo().alert();
		//get text
		System.out.println(promptAlert.getText());
		Thread.sleep(2000);
		//send keys
		promptAlert.sendKeys("Kiruthika");
		Thread.sleep(3000);
		//accept
		promptAlert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());

	}

}
