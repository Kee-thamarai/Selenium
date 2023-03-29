package locatingStrategies_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_SDCMA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting system property
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Selenium_WebDriver\\geckodriver.exe");
		//Instantiating WebDriver
		WebDriver driver = new FirefoxDriver();
		//Launching website
		driver.get("https://www.linkedin.com/");
		//Maximizing browser
		//driver.manage().window().maximize();
		//Locating webelements by xpath with single slash
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[1]/div/div/div/input")).sendKeys("kiruthikat1719@gmail.com");
		//Locating webelements by xpath with double slash
	    driver.findElement(By.xpath("//html//body//main//section//div//form//div[2]//div//div//input")).sendKeys("Sairam043!");
	    //Locating webelements by xpath with contains
	    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	    //Locating webelements by xpath with multiple attribute
	    driver.findElement(By.xpath("//*[@alt='Visit profile for KIRUTHIKA THAMARAI'][@id='ember26']")).click();
	    //Terminating browser
		driver.close();	
		System.out.println("Test passed!!!");
		
	}

}
