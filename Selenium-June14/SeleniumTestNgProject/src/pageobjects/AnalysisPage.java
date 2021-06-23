package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AnalysisPage {

	WebDriver driver;

	public AnalysisPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public @FindBy(how = How.CSS, using = "input[value='FXE Domestic']") WebElement segmentName;
	public @FindBy(how = How.XPATH, using = "//span[text()='FXE Domestic' and @class='wijmo-wijmenu-text']") WebElement segmentExistance;
	public @FindBy(how = How.XPATH, using = "//label[text()='Account Name:']//parent::td//following-sibling::td[position()=1]/span") WebElement accountNameLabel;
	public @FindBy(how = How.XPATH, using = "//label[text()='Payer Country:']//parent::td//following-sibling::td[position()=1]/span") WebElement payerCountryLabel;

}
