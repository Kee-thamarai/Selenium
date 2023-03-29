package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownByElementVisibility {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instatiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.get("https://www.lambdatest.com/");
		//Maximizing browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//specify the WebElement till which the page has to be scrolled
	    WebElement element = driver.findElement(By.xpath("//*[@title = 'All Browser and Devices']"));
	    //Scroll down the webpage
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    
	    //Terminating browser
	  	//driver.close();
	  	System.out.println("Page scrolled down by view successfully!!!");
	  			

	}

}
