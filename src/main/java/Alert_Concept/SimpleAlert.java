package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
	
				// Set Property:
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
				
				// Create ChromeDriver (Class) Object:
		ChromeDriver driver = new ChromeDriver();
		
				// Get / Input URL:
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
				// Maximize Windows
		driver.manage().window().maximize();
		
				// Implicitly Wait:
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
				// Click Submit:
				// Karnataka State Road Transport Corporation:
				// Input id using XPath:
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
				// Control to Alert from main page and get the text:
		String simpleAlert = driver.switchTo().alert().getText();
				
				// Print:
		System.out.println(simpleAlert);
		
				// Explicitly wait:
		Thread.sleep(2000);
		
				// Accept (Ok button):
		driver.switchTo().alert().accept();
		
				// Explicitly wait:
		Thread.sleep(2000);
				// Close Window:
		//driver.close();
		driver.quit();

	}

}
