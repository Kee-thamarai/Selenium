package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToTop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instatiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Maximizing browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Locating web elements
	    WebElement username = driver.findElement(By.name("username"));
	  //Passing values
	    username.clear();
	    username.sendKeys("Admin");
	    WebElement password = driver.findElement(By.name("password"));
	    
	    
	    password.clear();
	    password.sendKeys("admin123");
	    WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'')]"));
	    loginButton.click();
	    // Scrolling top
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    Thread.sleep(4000);
	    //Terminating browse
	    driver.close();
	    System.out.println("Scrolled top!!!");

	}

}
