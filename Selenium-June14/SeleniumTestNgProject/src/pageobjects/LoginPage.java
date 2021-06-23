package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public @FindBy(how = How.ID, using = "username") WebElement username;
	public @FindBy(how = How.NAME, using = "password") WebElement password;
	public @FindBy(how = How.CSS, using = "input[value=\" Sign In \"]") WebElement signIn;

	// @CacheLookup
	// String str = driver.getTitle();

}
