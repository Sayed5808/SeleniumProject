package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand {

	public static void main(String[] args) throws InterruptedException {

		//Set Property
	System.setProperty("webdriver.chrome.driver", "C:\\Testing (Mamun bai)\\Software and Apps\\chromedriver.exe");
		
		//Chrome Driver Object
ChromeDriver driver = new ChromeDriver();
		
		//Google (link)
//driver.get("https://www.google.com/");
driver.navigate().to("https://www.google.com/");

		//Maximize
driver.manage().window().maximize();

		//Implicitly (waiting time)
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Browser Backward
driver.navigate().back();

		//Explicitly wait
Thread.sleep(3000);

		//Browser Forward
driver.navigate().forward();

		//Refresh
driver.navigate().refresh();



		//Close Browser
//driver.close();
driver.quit();

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
