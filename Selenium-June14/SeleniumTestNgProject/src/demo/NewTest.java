package demo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actionspackage.Actions1;
import exceldata.ExcelUtilities;
import pageobjects.Commons;

public class NewTest {
	WebDriver driver;
	Actions1 actions1;
	Commons commons1;
	String filePath;
	Method[] allMethods;

	@Test(priority = 0)
	public void seleniumTest() throws Exception {
		ExcelUtilities excel1 = new ExcelUtilities();
		allMethods = Actions1.class.getMethods();
		String propFilePath = "E:/Selenium-June14/SeleniumTestNgProject/TestData/EpatTestData.xlsx";
		String moduleSheetName = "MODULES_SHEET";
		String tcSheetName = "TC_SHEET";
		String tsSheetName = "TEST_STEPS_SHEET";
		Map<String, List<String>> data1 = excel1.readDataFromExcel(propFilePath, moduleSheetName, tcSheetName,
				tsSheetName);
		System.out.println(data1.get("Keywords"));
		System.out.println(data1.get("TestData"));
		List<String> allKeyWords = data1.get("Keywords");
		List<String> allTestData = data1.get("TestData");

		for (int i = 0; i < allKeyWords.size(); i++) {
			String eachKeyword = allKeyWords.get(i);
			String[] testData2 = allTestData.get(i).split("~");
			List<Object> objList = new ArrayList<Object>();
			for (String testdata1 : testData2) {
				if(!testdata1.equalsIgnoreCase("Y"))
					objList.add(testdata1);
				else
					objList.add("");
					
			}

			Object[] param = new String[objList.size()];
			param = objList.toArray(param);
			executeTest(eachKeyword, param);
		}
		Commons.takeScreenshot(filePath);
		String srcPath = Commons.screenshotPath.toString();
		System.out.println(srcPath);
		Reporter.log("<img src=\"" + srcPath + "\"/>");
	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver.get("https://test.secure.fedex.com/L4A/ePAT/xhtml/home.jsf");
	}

	@AfterMethod
	public void afterMethod() {

	}

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		commons1 = new Commons(driver);
		actions1 = new Actions1(driver);

		filePath = "E:/Selenium-June14/SeleniumTestNgProject/Screenshots/";

	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driverfiles\\chromedriver.exe");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suit");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Class");
	}

	public void executeTest(String keyword, Object[] params)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		for (Method m1 : allMethods) {
			if (m1.getName().equals(keyword)) {
				m1.invoke(actions1, params);
			}
		}

	}

}
