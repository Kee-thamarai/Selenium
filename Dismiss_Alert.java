package handling_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dismiss_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system proprty
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Insatantiating browser
		WebDriver driver = new FirefoxDriver();
		//URL Defined
		String baseURL = "https://demo.guru99.com/test/delete_customer.php";
		//Launching URL
		driver.get(baseURL);
		//maximizing browser
		driver.manage().window().maximize();
		//Locating webelemets
		driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();
        //Cofirmation alert
        Alert dismissAlert = driver.switchTo().alert();
        //Way of capturing alert message
        String alertmessage = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        //Displaying Alert mesage
        System.out.println(alertmessage);
        //Dismissing alert
        Thread.sleep(2000);
        dismissAlert.dismiss();
        System.out.println("Pressed Cancel button");
        
        //Terminating browser
        driver.close();

	}

}
