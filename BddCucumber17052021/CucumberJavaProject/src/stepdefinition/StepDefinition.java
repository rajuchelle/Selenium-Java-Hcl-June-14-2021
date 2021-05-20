package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Before
	public void loadClasses(){
	    System.out.println("This is Background step");
	}
	
	@Before(order=1)
	public void loadClasses1(){
	    System.out.println("This is Background step1");
	}
	
	@Before("@SmokeTest")
	public void loadDB(){
	    System.out.println("This is DB step");
	}	
	
	
	@After
	public void restoyObject(){
		System.out.println("To destoy the setup step");
	}
	
	@Given("^I am on home page$")
	public void iAmOnHomePage() {
	    System.out.println("This is Given");
	}

	@When("^I enter user name as (\\d+) and Passwrd as (\\d+)$")
	public void iEnterUserNameAsAndPasswrdAs(int arg1, int arg2){
		System.out.println("This is When");
	}

	@And("^I click on Login button$")
	public void iClickOnLoginButton(){
		System.out.println("This is And");
	}

	@Then("^login should successful$")
	public void loginShouldSuccessful(){
		System.out.println("This is login pass Then");
	}
	

	@Then("^login should fail$")
	public void loginShouldFail(){
		System.out.println("This is login fail Then");
	}
	
}
