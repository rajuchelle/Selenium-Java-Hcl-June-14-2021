package actionspackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageobjects.AnalysisPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.ScenarioPage;
import pageobjects.SegmentPage;
import pageobjects.VolumePage;

public class Actions1 {

	WebDriver driver;
	LoginPage loginPage1;
	HomePage homePage1;
	AnalysisPage anaysisPage1;
	SegmentPage segmentPage1;
	ScenarioPage scenarioPage1;
	VolumePage volumenPage1;

	public Actions1(WebDriver driver) {
		this.driver = driver;
		loginPage1 = new LoginPage(driver);
		homePage1 = new HomePage(driver);
		anaysisPage1 = new AnalysisPage(driver);
		segmentPage1 = new SegmentPage(driver);
		scenarioPage1 = new ScenarioPage(driver);
		volumenPage1 = new VolumePage(driver);
	}

	public void getPageTitle(String pageName) {
		Assert.assertEquals(driver.getTitle().toString().equalsIgnoreCase(pageName), true);
	}

	public void setUserName(String userName) {
		loginPage1.username.sendKeys(userName);
	}

	public void setPassword(String password1) {
		loginPage1.password.sendKeys(password1);
	}

	public void clickSignInButton() {
		loginPage1.signIn.click();
	}

	public void setAccountName(String accountname) {
		homePage1.accountName.sendKeys(accountname);
	}

	public void selectPayerCountry(String countryName) throws InterruptedException {
		Select coutresDropDown = new Select(homePage1.countriesDropdown);
		coutresDropDown.selectByVisibleText(countryName);
		Thread.sleep(1000);
	}

	public void selectMarkAsTest() throws InterruptedException {
		homePage1.markAsTest.click();
		Thread.sleep(2000);
	}

	public void clickCreateAnalysisButton() throws InterruptedException {
		homePage1.createAnalysisButton.click();
		Thread.sleep(1000);
	}

	public void selectDomesticSegment() {
		anaysisPage1.segmentName.click();
	}

	public void segmentSelected() {
		Assert.assertEquals(anaysisPage1.segmentExistance.isDisplayed(), true);
	}

	public void getAccountNameLabel(String accountName) {
		Assert.assertEquals(anaysisPage1.accountNameLabel.getText().equalsIgnoreCase(accountName), true);
	}

	public void getPayerCountryLabel(String countryName) {
		Assert.assertEquals(anaysisPage1.payerCountryLabel.getText().equalsIgnoreCase(countryName), true);
	}

	public void updateAccountGroup(String newAccountGrpName) throws InterruptedException {

		Actions action1 = new Actions(driver);
		action1.moveToElement(segmentPage1.accountGrpField).doubleClick(segmentPage1.accountGrpField)
				.sendKeys(Keys.DELETE).sendKeys(newAccountGrpName);

		Action performActon = action1.build();
		performActon.perform();

		segmentPage1.updateButton.click();
		Thread.sleep(3000);
		segmentPage1.updateButton.click();
		Thread.sleep(2000);
	}

	public void isAccountUpdated(String accountName) {
		WebElement element = driver.findElement(By
				.xpath("//span[text()='Select Account Group:']//ancestor::td//following-sibling::td//descendant::label[text()='"
						+ accountName + "']"));
		Assert.assertEquals(element.isDisplayed(), true);
	}

	public void clickAeRequested() {
		segmentPage1.scenarioButton.click();
	}

	public void verifyAeRequested() {
		Assert.assertEquals(segmentPage1.aeRequestedExistance.isDisplayed(), true);
	}

	void clickWriteUpButton() {
		scenarioPage1.writeUpButton.click();
	}

	void setEmployeeIdInWriteUpScreen(String employeeId) throws InterruptedException {

		String defaultBrowserId = driver.getWindowHandle();

		Set<String> allWinodwIds = driver.getWindowHandles();

		Iterator<String> ite1 = allWinodwIds.iterator();

		while (ite1.hasNext()) {

			if (defaultBrowserId != ite1.next()) {
				driver.switchTo().window(ite1.next());

				driver.manage().window().maximize();
				Thread.sleep(2000);

				Actions action2 = new Actions(driver);
				action2.moveToElement(scenarioPage1.writeUpEmpIdField).click(scenarioPage1.writeUpEmpIdField)
						.sendKeys(Keys.CONTROL + "A").sendKeys(employeeId);

				Action performActon2 = action2.build();
				performActon2.perform();
				Thread.sleep(5000);

				driver.close();
			}
		}
		driver.switchTo().window(defaultBrowserId);
	}

	void clickFxeDomesticSGG() throws InterruptedException {
		scenarioPage1.fxeDomesticSSG.click();
		Thread.sleep(1000);

		if (scenarioPage1.fxeDomesticSSG.isDisplayed()) {
			scenarioPage1.fxeDomesticSSG.click();
		}
	}

	String getPageTitle() {
		return driver.getTitle();
	}

	void scrollPageDown() throws InterruptedException {
		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
		jsExecuter.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
	}

	void setFedExOfficeVal(String fedExOfficeval) throws InterruptedException {
		volumenPage1.fedExOfficeField.sendKeys(fedExOfficeval);
		Thread.sleep(2000);
	}

	void closeBrowser() {
		driver.close();
	}

	public void logOut() {
		driver.findElement(By.linkText("Log out")).click();
	}

	// public static void main(String[] args) throws IllegalAccessException,
	// IllegalArgumentException, InvocationTargetException {
	//
	// Method[] allmethods = Actions1.class.getMethods();
	////
	//
	// Actions1 ations1 = new Actions1();
	//
	// for(Method m1:allmethods){
	//// System.out.println(m1.getName());
	// if(m1.getName().equals("method1")){
	// m1.invoke(ations1);
	// }
	// }
	//
	//
	//
	// }

}
