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
	
	@FindBy(how=How.ID, using="segment:acctGroup") WebElement accountGrpField;
	@FindBy(how=How.CSS, using="input[value='Update'][type='submit']") WebElement updateButton;	
	@FindBy(how=How.CSS, using="input[value='AE Requested']") WebElement scenarioButton;
	@FindBy(how=How.XPATH, using="//span[text()='Select Scenario:']//parent::td//following-sibling::td//descendant::label[text()='AE Requested']") WebElement aeRequestedExistance;
	
	public void updateAccountGroup(String newAccountGrpName) throws InterruptedException{
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(accountGrpField).doubleClick(accountGrpField).sendKeys(Keys.DELETE).sendKeys(newAccountGrpName);
		
		Action performActon  = action1.build();		
		performActon.perform();			
		
		updateButton.click();
		Thread.sleep(3000);			
		updateButton.click();
		Thread.sleep(2000);	
	}
		
	public boolean isAccountUpdated(String accountName){
		element = driver.findElement(By.xpath("//span[text()='Select Account Group:']//ancestor::td//following-sibling::td//descendant::label[text()='"+accountName+"']"));
		return element.isDisplayed();			
	}		
	
	public void clickAeRequested(){
		scenarioButton.click();
	}
	
	public boolean verifyAeRequested(){
		return aeRequestedExistance.isDisplayed();
	}	
	
}
