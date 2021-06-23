package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public BaseClass(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\BDD Cucumber/seleniumbddcucumbermaven/BrowserDrivers/chromedriver.exe");
		
		driver = new ChromeDriver();		
	}
	
	public WebDriver getDriver(){
		
		return driver;
	}

}
