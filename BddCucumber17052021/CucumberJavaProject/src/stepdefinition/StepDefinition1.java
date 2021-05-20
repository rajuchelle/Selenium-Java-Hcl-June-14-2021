package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class StepDefinition1 {

	@And("^set Acount name and selet country$")
	public void set_Acount_name_and_selet_country(){
		System.out.println("This is set Account And");
	}

	@And("^click on Create analysis button$")
	public void click_on_Create_analysis_button() {
		System.out.println("This is click create analysis And");
		
	}

	@Then("^analysis shoud be created$")
	public void analysis_shoud_be_created(){
		System.out.println("This is Analysis created then");
		
	}

}
