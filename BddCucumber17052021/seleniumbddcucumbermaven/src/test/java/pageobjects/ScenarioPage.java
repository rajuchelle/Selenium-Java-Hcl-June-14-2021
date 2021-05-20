package pageobjects;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ScenarioPage {
	
	WebDriver driver;
	
	public ScenarioPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.CSS, using="input[value='Transfer Writeup']") WebElement writeUpButton;
	@FindBy(how=How.XPATH, using="//label[text()='Employee ID :']//parent::td//following-sibling::td[position()=1]/input") WebElement writeUpEmpIdField;
	@FindBy(how=How.CSS, using="input[value='FXE US Domestic']") WebElement fxeDomesticSSG;
	
	
	void clickWriteUpButton(){
		writeUpButton.click();
	}
	
	void setEmployeeIdInWriteUpScreen(String employeeId) throws InterruptedException{
		
		String defaultBrowserId = driver.getWindowHandle();			
		
		Set<String> allWinodwIds = driver.getWindowHandles();		
		
		Iterator<String> ite1 = allWinodwIds.iterator();
		
		while(ite1.hasNext()){
			
			if(defaultBrowserId!=ite1.next())
			{					
				driver.switchTo().window(ite1.next());
				
				driver.manage().window().maximize();
				Thread.sleep(2000);						
								
				Actions action2 = new Actions(driver);
				action2.moveToElement(writeUpEmpIdField).click(writeUpEmpIdField).sendKeys(Keys.CONTROL+"A").sendKeys(employeeId);
				
				Action performActon2  = action2.build();				
				performActon2.perform();		
				Thread.sleep(5000);
				
				driver.close();						
			}				
		}
		driver.switchTo().window(defaultBrowserId);		
	}
	
	void clickFxeDomesticSGG() throws InterruptedException{
		fxeDomesticSSG.click();
		Thread.sleep(1000);
		
		if(fxeDomesticSSG.isDisplayed())
		{
			fxeDomesticSSG.click();
		}
		
	}
	
	
	String getPageTitle(){
		return driver.getTitle();
	}
	
	
}
