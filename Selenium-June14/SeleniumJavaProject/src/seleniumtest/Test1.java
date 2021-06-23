package seleniumtest;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	static WebDriver driver ;
	static String filePath;
	public static void takeScreenshot(String filePath) throws IOException{		
		
			System.out.println(filePath);			
		DateFormat dtFm = new SimpleDateFormat("yyy-mm-dd hh:mm:ss");
		
		String starDate = (dtFm.format(new Date())).replace(":", "").replace(" ","_").replace("-", "_");
		String name1 = starDate+".jpg";
		System.out.println(filePath+name1);
		
		TakesScreenshot screenshot1 = (TakesScreenshot)driver;
		File file1 = screenshot1.getScreenshotAs(OutputType.FILE);
		
		File desFile = new File(filePath+name1);
		
		FileUtils.copyFile(file1, desFile);
		
		
		
	}

	public static void main(String[] args) throws Exception {
		
		filePath = "E:/Selenium-June14/SeleniumJavaProject/Screenshots/";

		System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driverfiles\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://test.secure.fedex.com/L4A/ePAT/xhtml/home.jsf");

		// WebElement element1 = driver.findElement(By.name("username"));
		//
		// element1.sendKeys("5001096");
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		
		jse1.executeScript("window.alert(\"Welcome\")");
		
		Thread.sleep(5000);
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.accept();

		LoginPage loginPage1 = new LoginPage(driver);
		loginPage1.setUserName("5001096");
		loginPage1.setPassword("5001096");
		loginPage1.clickSignIn();

		if (driver.getTitle().equals("Home")) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		} else {
			System.out.println("Fail");
		}

		// driver.findElement(By.linkText("Log out")).click();
		// driver.findElement(By.partialLinkText("Log")).click();

		driver.findElement(By.id("newAnalysisSubmit:newAccountName")).sendKeys("TEST1");

		// driver.findElement(By.id("newAnalysisSubmit:newPayerCntry"));

		Select countriesDropdown = new Select(driver.findElement(By.id("newAnalysisSubmit:newPayerCntry")));
		countriesDropdown.selectByVisibleText("United States");

		driver.findElement(By.id("newAnalysisSubmit:testAnalysis")).click();
		driver.findElement(By.id("newAnalysisSubmit:pushBttnNewAnalysis_button")).click();

		String expetedAccName = driver
				.findElement(By
						.xpath("//label[text()='Account Name:']//parent::td//following-sibling::td[position()=1]/span"))
				.getText();

		if (expetedAccName.contains("TEST1")) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		} else {
			System.out.println("Fail");
		}

		String expetedCountry = driver
				.findElement(By
						.xpath("//td//preceding-sibling::td/label[text()='Payer Country:']//parent::td//following-sibling::td[position()=1]/span"))
				.getText();

		if (expetedCountry.contains("US")) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		} else {
			System.out.println("Fail");
		}

		driver.findElement(By.cssSelector("input[value='FXF LTL']")).click();
		
//		WebElement aerequested = driver.findElement(By.cssSelector("input[value='AE Requested']"));
		
		WebDriverWait wait1 = new WebDriverWait(driver, 10);		
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='AE Requested']")));
//		FluentWait<T>
		

		if (driver.findElement(By.cssSelector("input[value='AE Requested']")).isDisplayed()) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		}else {
			System.out.println("Fail");

		}
		
		
		WebElement element2 = driver.findElement(By.id("segment:acctGroup"));
		
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(element2).doubleClick(element2).sendKeys(Keys.DELETE).sendKeys("TEST2");
				
		Action action2 = actions1.build();
		action2.perform();	
		
		
		driver.findElement(By.id("segment:pushBttnActionUpdateAcct")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("segment:pushBttnActionUpdateAcct")).click();
		
		
		
		if (driver.findElement(By.xpath("//label[text()='TEST2']")).isDisplayed()) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		}else {
			System.out.println("Fail");

		}
		
		driver.findElement(By.cssSelector("input[value='AE Requested']")).click();
		
		if (driver.findElement(By.cssSelector("input[value='Intra-Country']")).isDisplayed()) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		}else {
			System.out.println("Fail");

		}
		
		driver.findElement(By.cssSelector("input[value='Transfer Writeup']")).click();
				
		String currWindow = driver.getWindowHandle();
		
		System.out.println(driver.getWindowHandles());
		
		Set<String> set1 = driver.getWindowHandles();
		
		
		
		for(String s1:set1){
			
			if(!currWindow.equals(s1)){
				System.out.println(s1);
				
				driver.switchTo().window(s1);
				
				driver.manage().window().maximize();
				
				FluentWait<WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver);
				
				fluentWait1.withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
				
				fluentWait1.until((driver1)->{return driver.findElement(By.xpath("//label[text()='Employee ID :']//parent::td//following-sibling::td[position()=1]/input[starts-with(@id,'writeUpForm')]"));});
						
//						new Function<WebDriver, WebElement>() {
//
//					@Override
//					public WebElement apply(WebDriver driver) {
//						// TODO Auto-generated method stub
//						return driver.findElement(By.xpath("//label[text()='Employee ID :']//parent::td//following-sibling::td[position()=1]/input[starts-with(@id,'writeUpForm')]"));
//					}
//				});
				
				
				driver.findElement(By.xpath("//label[text()='Employee ID :']//parent::td//following-sibling::td[position()=1]/input[starts-with(@id,'writeUpForm')]")).sendKeys("823624");
				
				driver.close();
			}
		}
		driver.switchTo().window(currWindow);
		driver.findElement(By.cssSelector("input[value='Intra-Country']")).click();
		Thread.sleep(2000);
		
		if(driver.findElement(By.cssSelector("input[value='Intra-Country']")).isDisplayed()){
			driver.findElement(By.cssSelector("input[value='Intra-Country']")).click();
		}
		
		if (driver.findElement(By.xpath("//button[text()='Actions']")).isDisplayed()) {
			System.out.println("Pass");
			takeScreenshot(filePath);
		}else {
			System.out.println("Fail");

		}
		
		
		
		jse1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		WebElement stoTimeElement= driver.findElement(By.id("j_idt44:j_idt207:14:_t224"));
		
//		window.scrollTo(0,document.body.scrollHeight)
		
		jse1.executeScript("arguments[0].scrollIntoView(true);", stoTimeElement);
		
		driver.findElement(By.id("j_idt44:j_idt207:14:_t224")).sendKeys("100");
		
	}

}
