package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)	{		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.NAME,using="newAnalysisSubmit:newAccountName") WebElement accountName;
	@FindBy(how=How.NAME,using="newAnalysisSubmit:newPayerCntry") WebElement countriesDropdown;
	@FindBy(how=How.XPATH,using="//span[text()='Mark as Test']//following-sibling::input[@id='newAnalysisSubmit:testAnalysis']") WebElement markAsTest;
	@FindBy(how=How.ID,using="newAnalysisSubmit:pushBttnNewAnalysis_button") WebElement createAnalysisButton;
	
	
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void setAccountName(String accountname)
	{
		accountName.sendKeys(accountname);
	}
	
	public void selectPayerCountry(String countryName) throws InterruptedException{
		Select coutresDropDown = new Select(countriesDropdown);
		coutresDropDown.selectByVisibleText(countryName);
		Thread.sleep(1000);
	}
	
	public void selectMarkAsTest() throws InterruptedException{
		markAsTest.click();
		Thread.sleep(2000);
	}
	
	public void clickCreateAnalysisButton() throws InterruptedException{
		createAnalysisButton.click();	
		Thread.sleep(1000);
	}
	
	
	
}
