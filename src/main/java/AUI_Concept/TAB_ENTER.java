package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome driver class objerct		
		ChromeDriver driver = new ChromeDriver();
	
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter email (user name)
		driver.findElementByName("email").sendKeys("yahoo@gmail.com");
		
		//Create (action) class object, and pass the driver
		Actions action = new Actions(driver);
		
		//Explicitly wait
		Thread.sleep(2000);
		
		//hit Tab key from keyboard then Tab action will perform
		action.sendKeys(Keys.TAB)
		//enter password in the Password field
		.sendKeys("sayed")
		//perform action by using .build()
		.build().perform();
		
		//hit Enter key from keyboard after Tab key
		action.sendKeys(Keys.ENTER).perform();
		
		//hit again Tab key from keyboard for perform next page
		action.sendKeys(Keys.TAB);
		
		//Explicitly wait
		Thread.sleep(2000);
		
		//Close Browser
		driver.quit();

	}

}
