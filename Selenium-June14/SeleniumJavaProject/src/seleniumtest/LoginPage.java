package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	WebDriver driver;	
	
	LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") WebElement userName1;
	
	@FindBy(how=How.NAME, using="username") WebElement userName2;
//	@CacheLookup
	
//	@FindBys(
//			@FindBy(name="password");
//			@FindBy(how=How.NAME, using="username")
//		) WebElement wbElemet1;
//		
//	@FindAll(
//			@FindBy(how=How.NAME, using="username"),
//			@FindBy(how=How.ID, using="userid"),
//			@FindBy(how=How., using="userclass")
//			)
//	
	
	
	
	public void setUserName(String userName){
		userName2.sendKeys(userName);
	} 
	
	public void setPassword(String password){
		driver.findElement(By.id("password")).sendKeys(password);
	} 
	
public void clickSignIn(){
	driver.findElement(By.className("buttons")).click();
	} 
	
}
