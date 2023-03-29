import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set property of chrome driver
		System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Resources\\Drivers\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		//Instantiating browser
		WebDriver driver = new FirefoxDriver();
		//Maximizing window
		driver.manage().window().maximize();
		
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		//Launching browser session
		driver.get("https://demo.guru99.com/test/newtours/");
		
		// get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close the browser
        driver.close();
        
        System.exit(0);
		
		 

	}

}