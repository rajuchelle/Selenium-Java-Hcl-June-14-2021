package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition {

	@Before
	public void loadClasses() {
		System.out.println("This is Background step");		
	}

	@Before(order = 1)
	public void loadClasses1() {
		System.out.println("This is Background step1");
	}

	@Before("@SmokeTest")
	public void loadDB() {
		System.out.println("This is DB step");
	}

	@After
	public void restoyObject() {
		System.out.println("To destoy the setup step");
	}

	@Given("^I am on home page$")
	public void iAmOnHomePage() {
		System.out.println("This is Given");
	}

	// @When("^I enter user name as (\\d+) and Passwrd as (\\d+)$")
	// public void iEnterUserNameAsAndPasswrdAs(int arg1, int arg2){
	// System.out.println("This is When");
	// }

	@When("I enter user name as {int} and Passwrd as {int}")
	public void iEnterUserNameAsAndPasswrdAs(Integer int1, Integer int2) {
		System.out.println("This is When");
	}

	@And("^I click on Login button$")
	public void iClickOnLoginButton() {
		System.out.println("This is And");
	}

	@Then("^login should successful$")
	public void loginShouldSuccessful() {
		System.out.println("This is login pass Then");
	}

	@Then("^login should fail$")
	public void loginShouldFail() {
		System.out.println("This is login fail Then");
		Assert.assertEquals("Pass", "Pass");
	}

}
