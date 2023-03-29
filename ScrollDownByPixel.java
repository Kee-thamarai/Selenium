package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownByPixel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instatiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.get("https://demo.guru99.com/test/guru99home/");
		//Maximizing browser
		driver.manage().window().maximize();
		//Scroll down the webpage by 5000 pixels  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		//Locating webelements
		WebElement Element = driver.findElement(By.linkText("Linux"));
		Element.click();
		
		//Terminating browser
		driver.close();
		System.out.println("Page scrolled down successfully!!!");
		
	}

}
