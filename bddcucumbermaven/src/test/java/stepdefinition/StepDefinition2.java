package stepdefinition;


import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 {

	@Given("^adhoc popup shoud be available$")
	public void adhocPopupShoudBeAvailable(){
		System.out.println("Adhoc request popup available");
	}

	@When("^user enters the valid adhoc request data$")
	public void userEntersTheValidAdhocRequestData(DataTable table1){
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.			
		
//		List list1 = table1.asList(String.class);		
//		System.out.println(list1);		
//		for(Object obj1:list1){
//			System.out.println(obj1);
//		}
		
		
//		List<List<String>> list2 = table1.asLists(String.class);
//		System.out.println(list2);
//		
//		for(List obj2:list2){
//			System.out.println(obj2);
//			for(Object str:obj2){
//				System.out.println(str);
//			}
//		}
		
		
		List<Map<String,String>> list3 = table1.asMaps(String.class, String.class);
		System.out.println(list3);		
		for(Map obj3:list3){
			System.out.println(obj3);
			System.out.println(obj3.get("adhocName"));			
		}
		
//		Map<String,String> map1= (Map<String, String>) table1.asMaps(String.class, String.class);
//		
//		System.out.println(map1);
		
	}
	

	@Then("^adhoc request should be created$")
	public void dhocRequestShouldBeCreated(){
		System.out.println("Adhoc request created");		
	}
}
