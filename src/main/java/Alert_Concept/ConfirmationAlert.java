package Alert_Concept;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
	
			// Set Property:
	System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
	
			// Create ChromeDriver (Class) Object:
	ChromeDriver driver = new ChromeDriver();
	
			// Get / Input URL:
	driver.get("http://leaftaps.com/opentaps/control/login");

			// Maximize Window:
	driver.manage().window().maximize();
	
			// Implicitly Wait:
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
			// Input User Name using XPath:
	driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
			// Input Password
	driver.findElementById("password").sendKeys("crmsfa");
	
			// Click Login
	driver.findElementByClassName("decorativeSubmit").click();
	
			// Click (CRM/SFA) Link:
	driver.findElementByLinkText("CRM/SFA").click();
	
			// Click Lead:
	driver.findElementByLinkText("Leads").click();
	
			// Click Merge Lead:
	driver.findElementByLinkText("Merge Leads").click();
	
			// Click Merge button:
	driver.findElementByLinkText("Merge").click();
	
			// Control to Alert from main page and get the text:
	String ConfirmationAlert = driver.switchTo().alert().getText();
	
			// Print:
	System.out.println(ConfirmationAlert);
	
			// Explicitly Wait:
	Thread.sleep(2000);
	
			// Accept (Ok button)
	//driver.switchTo().alert().accept();
	
			// Dismiss (Cancel button):
	driver.switchTo().alert().dismiss();
	
			// Explicitly Wait:
	Thread.sleep(3000);
	
			// Close Window:
	//driver.close();
	driver.quit();
	
	}

}
