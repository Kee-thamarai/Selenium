package locatingStategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class By_linkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setiing system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Insatantiating driver
		WebDriver element = new FirefoxDriver();
		//Lanching browser
		element.get("https://www.javatpoint.com/");
		//maximizing browser
		element.manage().window().maximize();
		//Locating webelements by passing values
		//Located by link text
		element.findElement(By.linkText("Join Now")).click();
		//Terminating browser
		element.close();
		System.out.println("Test passed");
		

	}

}
