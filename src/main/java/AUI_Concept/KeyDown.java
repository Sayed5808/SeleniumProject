package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Set Property
		System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome driver class objerct		
		ChromeDriver driver = new ChromeDriver();
	
		//Enter URL
		driver.get("https://jqueryui.com/selectable/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Switch to Frame
		driver.switchTo().frame(0);
		
		//Select KeyDown elements and store in a variable
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");
		//explicitly wait
		Thread.sleep(1000);
		
		WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");
	
		//Create (action) class object, and pass the driver
		Actions action = new Actions(driver);
		
		//Keys Control and Perform
		action.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item4).click(Item5).click(Item6).click(Item7).release().perform();
		
		//Explicitly wait
		Thread.sleep(1000);
		
		//Close Browser
		//driver.close();
		driver.quit();
	
	
	
	}

	
	}