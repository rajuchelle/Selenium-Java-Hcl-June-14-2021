package stepdefinition;

import java.util.*;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;

public class StepDefinition4 {
	
	@ParameterType("(.*)")
	public List<String> verificaionData(String verfydata){					
		return Arrays.asList(verfydata.split(","));		
	}	
	
	@Given("verfiy adhoc data {verificaionData}")
	public void verfiyAdhocData(List<String> verifyData) {
		
		for(String str:verifyData){
			System.out.println(str);
		}	    
	}

}
