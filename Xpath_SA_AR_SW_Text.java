package locatingStrategies_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_SA_AR_SW_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
				System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
				//Instantiating WebDriver
				WebDriver driver = new FirefoxDriver();
				//Launching website
				driver.get("https://www.google.com/");
				//Maximizing browser
				//driver.manage().window().maximize();
				//Locating webelements by xpath with single attribute
				//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Java");
				//Locating webelements by xpath with AND
			    //driver.findElement(By.xpath("//*[@name='q' and @title='Search']")).sendKeys("Selenium");
			    //Locating webelements by xpath with OR
			    //driver.findElement(By.xpath("//*[@name='q' or @title='Search']")).sendKeys("Automation");
			    //Locating webelements by xpath as Starts with
			    driver.findElement(By.xpath("//*[starts-with(@title,'Sea')]")).sendKeys("Manual");
			    //Locating webelements by xpath as text()
			    driver.findElement(By.xpath("//span[text()='Sign in']")).click();
			    //Terminating browser
				driver.close();	
				System.out.println("Test passed!!!");

	}

}
