package differentBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Resources\\Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		//Instantiating browser
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("http://www.javatpoint.com/");
		//Maximizing window
		driver.manage().window().maximize();
		//Locating WebElements
		WebElement search = driver.findElement(By.name("search"));
		WebElement button = driver.findElement(By.className("gsc-search-button"));
		
		//Passing values
		search.sendKeys("Java");
		button.click();
		
		//Terminating the browser
		driver.close();
		System.out.println("Passed!!!");
	
	}

}
