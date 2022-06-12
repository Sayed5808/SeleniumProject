package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

 @Test
 public void launchChromeBrowser() {
 
		//Launch ChromeBrowser
System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");

		//Creating object of ChromeDriver class
ChromeDriver driver = new ChromeDriver();

		//Load URL
driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize
driver.manage().window().maximize();

		//Implicitly wait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//enter username
driver.findElementById("username").sendKeys("DemoSalesManager");

		//enter password
driver.findElementById("password").sendKeys("crmsfa");

		//click login
driver.findElementByClassName("decorativeSubmit").click();

		//Logout
driver.findElementByClassName("decorativeSubmit").click();

//enter username (again)
driver.findElementById("username").sendKeys("DemoSalesManager");

//enter password (again)
driver.findElementById("password").sendKeys("crmsfa");

//click login (again)
driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA (link text)
driver.findElementByLinkText("CRM/SFA").click();

		//Click on Leads (link)
driver.findElementByLinkText("Leads").click();

		//Click on Create Lead (link)
driver.findElementByLinkText("Create Lead").click();

		//Input Company Name
driver.findElementById("createLeadForm_companyName").sendKeys("Ahmed Trade Center");
		
		//Input Forename (first name)
driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		//Input Surname (last name)
driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

		//Explicitly wait
Thread.sleep(2000);

		//Create Leade (button)
driver.findElementByClassName("smallSubmit").click();













	}

}
