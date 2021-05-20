package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjects.BaseClass;
import pageobjects.Commons;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginPageStepDefinition {
	
	public WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private Commons commonActions;
	
	public LoginPageStepDefinition(BaseClass baseClass){
		this.driver = baseClass.getDriver();		
	}
	
	@Before
	public void forEachScenario(Scenario scenario1){		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		commonActions = new Commons(driver);
		commonActions.scenario = scenario1;
		
		driver.get("https://test.secure.fedex.com/L4A/ePAT/xhtml/home.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterStep
	public void atachScreenshotForSteps(){
		if(commonActions.scenario.isFailed()){
			commonActions.takeScrrenShot();
		}	
		
//		commonActions.takeScrrenShot();
	}
	
	
	@After
	public void afterEachScenario(){	
//		commonActions.takeScrrenShot();
		driver.close();
	}

	@Given("I am on Login page")
	public void iAmOnLoginPage() {		
		Assert.assertEquals("WSSO Login", loginPage.getPageTitle());
//		commonActions.takeScrrenShot();
	}

	@When("I enter user name as {string} and Passwrd as {string}")
	public void iEnterUserNameAsAndPasswrdAs(String userName, String password1) {
		loginPage.setUserName(userName);
		loginPage.setPassword(password1);
//		commonActions.takeScrrenShot();
	}

	@When("I click on Login button")
	public void iClickOnLoginButton() {
		loginPage.clickSignInButton();
//		commonActions.takeScrrenShot();
	}

	@Then("login should successful")
	public void loginShouldSuccessful() {
		Assert.assertEquals("Home", homePage.getPageTitle());
//		commonActions.takeScrrenShot();
	}
	
	@Then("login should fail")
	public void loginShouldFail() {
		Assert.assertEquals("Authorization Failure", homePage.getPageTitle());
	}

}
