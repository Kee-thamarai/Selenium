package scroll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HorizontalLeft {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instatiating driver
		WebDriver driver = new FirefoxDriver();
		//Launching browser
		driver.get("https://www.album.alexflueras.ro/index.php");
		//Maximizing browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Scroll the webpage
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating webelement which needs to be scroll
		WebElement element = driver.findElement(By.xpath("//*[@id = 'a4']"));
		js.executeScript("arguments[0].scrollIntoView();", element);
	    //Terminating browser
	    //driver.close();
	    System.out.println("Scrolled Horizontally!!!");

	}

}
