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
	
	public @FindBy(how=How.NAME,using="newAnalysisSubmit:newAccountName") WebElement accountName;
	public @FindBy(how=How.NAME,using="newAnalysisSubmit:newPayerCntry") WebElement countriesDropdown;
	public @FindBy(how=How.XPATH,using="//span[text()='Mark as Test']//following-sibling::input[@id='newAnalysisSubmit:testAnalysis']") WebElement markAsTest;
	public @FindBy(how=How.ID,using="newAnalysisSubmit:pushBttnNewAnalysis_button") WebElement createAnalysisButton;
	public @FindBy(how=How.LINK_TEXT, using="Log out") WebElement logoutApp;
//			,using="newAnalysisSubmit:pushBttnNewAnalysis_button") WebElement createAnalysisButton;
	
	
}
