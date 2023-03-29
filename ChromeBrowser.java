package differentBrowsers;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Selenium_WebDriver\\src\\differentBrowsers\\chromedriver.exe");
		//Instantiating browser
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);

		//Launch website
		driver.get("http://www.javatpoint.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Scroll down the webpage by 5000 pixels  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		
		// Click on the Search button  
        driver.findElement(By.linkText("Java")).click();   
        
        
     
      	System.out.println("Passed");
      

	}

}
