package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome driver class objerct
		ChromeDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("http://mrbool.com");
		
		//Maximize windows
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Select / findout (Content) element and store it in a variable
		WebElement content = driver.findElementByClassName("menulink");
		
		//Create (action) class object, and pass the driver
		Actions action = new Actions(driver);
		
		//Perform MoveToElement (Mouse Hover On) action, Pass the element and use .perform() Method
		action.moveToElement(content).perform();
		
		//Then click the Articles context or element
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//Close the Browser
		//driver.close();
		driver.quit();
		

	}

}
