package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SegmentPage {
	
	WebDriver driver;
	WebElement element;
	
	public SegmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public @FindBy(how=How.ID, using="segment:acctGroup") WebElement accountGrpField;
	public @FindBy(how=How.CSS, using="input[value='Update'][type='submit']") WebElement updateButton;	
	public @FindBy(how=How.CSS, using="input[value='AE Requested']") WebElement scenarioButton;
	public @FindBy(how=How.XPATH, using="//span[text()='Select Scenario:']//parent::td//following-sibling::td//descendant::label[text()='AE Requested']") WebElement aeRequestedExistance;
	
	
	
}
