package collectionsex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<String,String>();
		
		map1.put("FirstName", "Raju");
		map1.put("LastName", "Chelle");
		
		System.out.println(map1.get("FirstName"));
		
		Set set1 = map1.keySet();
		System.out.println(set1);
		
		Set<Map.Entry<String, String>> entrySet1 = map1.entrySet();
		
		System.out.println(entrySet1);
		
		for(Map.Entry entries:entrySet1){
			System.out.println(entries);
			System.out.println(entries.getValue());
			System.out.println(entries.getKey());
		}		

	}

}
