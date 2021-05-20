package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	WebDriver driver;

	public BaseClass() {
		System.setProperty("webdriver.chrome.driver",
				"E:/BddCucumber17052021/seleniumbddcucumbermaven/browserDriver/chromedriver.exe");

		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver(){
		return driver;
	}

}
