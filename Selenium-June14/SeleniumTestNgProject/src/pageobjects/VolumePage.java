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
		PageFactory.initElements(driver, this);
	}

	public @FindBy(how = How.XPATH, using = "//label[starts-with(text(),'FedEx Office')]//parent::td//following-sibling::td[position()=2]/input") WebElement fedExOfficeField;

}
