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
		PageFactory.initElements(driver, this);
	}

	public @FindBy(how = How.CSS, using = "input[value='Transfer Writeup']") WebElement writeUpButton;
	public @FindBy(how = How.XPATH, using = "//label[text()='Employee ID :']//parent::td//following-sibling::td[position()=1]/input") WebElement writeUpEmpIdField;
	public @FindBy(how = How.CSS, using = "input[value='FXE LTL']") WebElement fxeDomesticSSG;

}
