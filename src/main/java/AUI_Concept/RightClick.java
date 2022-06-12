package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
	
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome driver class objerct	
		ChromeDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		            		
		//Maximize window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Select Right Click elements and store in a variable
		WebElement rightclick = driver.findElementByXPath("//span[text()='right click me']");
		
		//Create (action) class object, and pass the driver
		Actions action = new Actions (driver);
		
		//Perform RightClick
		action.contextClick(rightclick).perform();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//Close Browser
		driver.quit();
		
		
	}

}
