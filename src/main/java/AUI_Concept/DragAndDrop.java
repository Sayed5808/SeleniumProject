package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome driver class objerct	
		ChromeDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("https://jqueryui.com/droppable/");
		
		//Maximize windows
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to Frame / iFrame
		driver.switchTo().frame(0);
		
		//Select Draggable elements and store in a variable
		WebElement src = driver.findElementById("draggable");
		
		//Select Droppable elements and store in a variable
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//Create (action) class object, and pass the driver
		Actions action = new Actions (driver);
		
		//Explicitly wait
		Thread.sleep(2000);
		
		//Perform DragAndDrop action, Pass the element and use .perform() method
		action.dragAndDrop(src, dest).perform();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//Switch back from frame
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
				
		//Click Selectable
		driver.findElementByLinkText("Selectable").click();
		
		//Explicitly wait
		Thread.sleep(2000);
		
		//Close browser
		driver.quit();
		
		
	}

}
