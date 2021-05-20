package pageobjects;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;

public class Commons {

	WebDriver driver;

	public Scenario scenario;

	TakesScreenshot tScreen;

	public Commons(WebDriver driver) {
		this.driver = driver;
	}

	public void takeScrrenShot() {

		tScreen = (TakesScreenshot) driver;
		byte[] screnshot = tScreen.getScreenshotAs(OutputType.BYTES);

		scenario.embed(screnshot, "image/jpeg");

	}

}
