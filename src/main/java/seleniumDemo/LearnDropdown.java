package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		//Set Property
	System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome Driver Object
ChromeDriver driver = new ChromeDriver();
		
		//Google (link)
//driver.get("https://www.google.com/");
driver.navigate().to("http://leaftaps.com/opentaps/control/login");

		//Maximize
driver.manage().window().maximize();

		//Implicitly (waiting time)
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Browser Backward
driver.navigate().back();

		//Explicitly wait
Thread.sleep(2000);

		//Browser Forward
driver.navigate().forward();

		//Refresh
driver.navigate().refresh();

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
		
		//Input Parent Account
//driver.findElementById("createLeadForm_parentPartyId").sendKeys("ABC123DEF456");

		//Input First Name
driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

		//Input last Name
driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

		//Dropdown
	//Source
WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
	//Create (new) Object of select class for Dropdown
Select dd = new Select(Source);
dd.selectByVisibleText("Website");
//Explicitly wait
Thread.sleep(1000);
dd.selectByValue("LEAD_EXISTCUST");
//Explicitly wait
Thread.sleep(1000);
dd.selectByIndex(9);

	//Marketing Campaign
WebElement MarketingCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
Select dd1 = new Select(MarketingCampaign);
//Explicitly wait
Thread.sleep(1000);
dd1.selectByVisibleText("Car and Driver");
//Explicitly wait
Thread.sleep(1000);
dd1.selectByValue("9002");
//Explicitly wait
Thread.sleep(1000);
dd1.selectByIndex(5);

			//Input First Name (Local)
driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sayed");

			//Input Last Name (Local)
driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ahmed");

			//Input Salutation 
driver.findElementById("createLeadForm_personalTitle").sendKeys("Everything");

			//Input Birth Date 
driver.findElementById("createLeadForm_birthDate").sendKeys("01/01/2000");

			//Input Title 
driver.findElementById("createLeadForm_generalProfTitle").sendKeys("President");

			//Input Department
driver.findElementById("createLeadForm_departmentName").sendKeys("Director Board");

			//Input Annual Revenue
driver.findElementById("createLeadForm_annualRevenue").sendKeys("980500765");		

		//Dropdown
	//Industry
WebElement Industry = driver.findElementByName("industryEnumId");
Select dd2 = new Select(Industry);
dd2.selectByVisibleText("Computer Hardware");
//Explicitly wait
Thread.sleep(1000);
dd2.selectByValue("IND_SOFTWARE");
//Explicitly wait
Thread.sleep(1000);
dd2.selectByIndex(10);

					//Input Number Of Employees
driver.findElementById("createLeadForm_numberEmployees").sendKeys("8456");

		//Dropdown
	//Ownership
WebElement Ownership = driver.findElementByName("ownershipEnumId");
Select dd3 = new Select(Ownership);
dd3.selectByVisibleText("LLC/LLP");
//Explicitly wait
Thread.sleep(1000);
dd3.selectByValue("OWN_CCORP");
//Explicitly wait
Thread.sleep(1000);
dd3.selectByIndex(5);

					//Input SIC Code
driver.findElementById("createLeadForm_sicCode").sendKeys("XYZ9876");

					//Input Ticker Symbol
driver.findElementById("createLeadForm_tickerSymbol").sendKeys("**##$$$##**");

					//Input Description
driver.findElementById("createLeadForm_description").sendKeys("Welcome to the Selenium World. We will make your Dream become True.");

					//Input ImportantNote
driver.findElementById("createLeadForm_importantNote").sendKeys("Dream is your, HardWork is Ours. For US, For Family.");

				//Input Area Code
driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("786");

				//Input Phone Number	
driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("0987");

				//Input Extension
driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("1234");

				//Input Person to Ask For
driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Self");
		
				//Input E-Mail Address
driver.findElementById("createLeadForm_primaryEmail").sendKeys("MySelenium100%@gmail.com");

				//Input Web Url
driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.SeleniumWorld.com");		
		
				//Input To Name	
driver.findElementById("createLeadForm_generalToName").sendKeys("Sayed Ahmed");

				//Input Attention Name
driver.findElementById("createLeadForm_generalAttnName").sendKeys("Kamrul Islam");

				//Input Address 1
driver.findElementById("createLeadForm_generalAddress1").sendKeys("1234");

				//Input Address 2
driver.findElementById("createLeadForm_generalAddress2").sendKeys("Dream World RD");

				//Input City
driver.findElementById("createLeadForm_generalCity").sendKeys("New York");		
		
		//Dropdown
	//State/Province
WebElement State = driver.findElementByName("generalStateProvinceGeoId");
Select dd4 = new Select(State);
//Explicitly wait
Thread.sleep(1500);
dd4.selectByVisibleText("Michigan");
	
			//Input Zip/Postal Code
driver.findElementById("createLeadForm_generalPostalCode").sendKeys("67890");

			//Input Zip/Postal Code Extension
driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("2780-45");	

			//Create Leade (button)
driver.findElementByClassName("smallSubmit").click();


		//Explicitly wait
Thread.sleep(9000);
		//Partial Link Text
driver.findElementByPartialLinkText("Upload L").click();

		//Multiple Tag Name
List<WebElement> alldiv = driver.findElementsByTagName("div");
System.out.println(alldiv.size());

		//Explicitly wait
Thread.sleep(3000);
		//Close Browser
//driver.close();
driver.quit();
		

	}

	private static Select Select(WebElement industry) {
		// TODO Auto-generated method stub
		return null;
	}

}
