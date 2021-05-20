package pageobjects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VolumePage {
	
	WebDriver driver;
	
	public VolumePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH, using="//label[starts-with(text(),'FedEx Office')]//parent::td//following-sibling::td[position()=2]/input") WebElement fedExOfficeField;
	@FindBy(how=How.LINK_TEXT, using="Log out") WebElement logoutButton;
	
	
	void scrollPageDown() throws InterruptedException{
		JavascriptExecutor jsExecuter  = (JavascriptExecutor)driver;		
		jsExecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");		
		Thread.sleep(2000);		
	}
	
	void setFedExOfficeVal(String fedExOfficeval) throws InterruptedException{
		fedExOfficeField.sendKeys(fedExOfficeval);
		Thread.sleep(2000);
	}
	
	void logout() throws InterruptedException{
		logoutButton.click();
		Thread.sleep(4000);
	}
	
	void closeBrowser(){
		driver.close();
	}
			
}
