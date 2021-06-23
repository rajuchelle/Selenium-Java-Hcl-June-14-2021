package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShippmetsPage {
	WebDriver driver;
	
	public ShippmetsPage(WebDriver driver)	{		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

}
