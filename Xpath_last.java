package locatingStrategies_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver","C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating WebDriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fwww.google.com%2F&dsh=S-502832863%3A1678795143388304&flowEntry=SignUp&flowName=GlifWebSignIn&hl=en&ifkv=AWnogHeD9KyUZ1NQdubrU3G9tXD8joegqYfpOW1o6lCsRSzA7Dw-Oxyl_BaAPhFyBfD9_2zTMtyWTQ");
		//Maximizing browser
		//driver.manage().window().maximize();
		//Locating webelements by xpath with single attribute
		driver.findElement(By.xpath("(//input[@type='password'])[last()]")).sendKeys("Sairam");
		//Terminating browser
		driver.close();
		System.out.print("Test Passed!");

	}

}
