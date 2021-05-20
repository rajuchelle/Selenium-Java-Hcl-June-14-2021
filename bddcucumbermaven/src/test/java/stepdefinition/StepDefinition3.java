package stepdefinition;

import java.util.*;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class StepDefinition3 {
	
	@DataTableType()
	public AcountInfo converData(Map<String,String> data){
//		return data;		
		return (new AcountInfo(				
				data.get("AccountName"),
				data.get("AccountType")
				));
	}
	
	class AcountInfo{		
		String accountName;
		String accountType;
		
		public AcountInfo(String accountName, String accountType){			
			this.accountName= accountName;
			this.accountType = accountType;			
		}		
	}
	
	@Given("the data table data")
	public void theDataTableData(List<AcountInfo> tableData) {
		
//		for(Map mapObj: tableData){
//			System.out.println(mapObj.get("AccountName"));
//			System.out.println(mapObj.get("AccountType"));
//		}	
		
		for(AcountInfo info:tableData){
			System.out.println(info.accountName);
			System.out.println(info.accountType);
			
		}
//		Assert.assertEquals("Pass", "Pass");		
	}

}
