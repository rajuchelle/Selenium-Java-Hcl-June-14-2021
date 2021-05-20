package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pageobjects.AnalysisPage;
import pageobjects.BaseClass;
import pageobjects.HomePage;

public class HomePageStepDefinition {

	WebDriver driver;
	
	private HomePage homePage;
	private AnalysisPage analysisPage;
	
	public HomePageStepDefinition(BaseClass baseClass){
		this.driver = baseClass.getDriver();
	}
	
	@And("I enter account name as {string} and country as {string}")
	public void iEnterAccountNameAsAndCountryAs(String accountname, String countryName) throws InterruptedException {
		
		homePage = new HomePage(driver);
		analysisPage = new AnalysisPage(driver);
		homePage.setAccountName(accountname);
		homePage.selectPayerCountry(countryName);
		homePage.selectMarkAsTest();
		homePage.clickCreateAnalysisButton();
		Assert.assertEquals("Analysis", analysisPage.getPageTitle());

	}

	@Then("I verify account name {string} and country name as {string}")
	public void iVerifyAccountNameAndCountryNameAs(String accountName, String countryCode) {
//		analysisPage = new AnalysisPage(driver);
		Assert.assertEquals(accountName, analysisPage.getAccountNameLabel());
		Assert.assertEquals("US1", analysisPage.getPayerCountryLabel());

	}

}
