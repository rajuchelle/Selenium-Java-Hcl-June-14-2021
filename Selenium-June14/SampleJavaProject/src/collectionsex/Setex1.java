package collectionsex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Setex1 {

	public static void main(String[] args) {
		
		Set<Object> set1 = new HashSet<Object>();
		
		set1.add(10);
		set1.add(100);
		set1.add(1001);
		set1.add(10.5F);
		set1.add(100.3643D);
		set1.add(1003643L);
		set1.add('A');
		set1.add("String1");
		set1.add(10);
		
		System.out.println(set1);		
		
//		for(Object obj1:set1){
//			System.out.println(obj1);
//		}
		
//		Iterator itr = set1.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//		}
		
		
		Set set2 = new TreeSet();
		set2.add(10);
		set2.add(1002);
		set2.add(1001);
//		set2.add(10.5F);
//		set2.add(100.3643D);
//		set2.add(1003643L);
//		set2.add('A');
//		set2.add("String1");
//		set2.add(10);
		
		System.out.println(set2); 
		
//		for(Object obj1:set1){
//			System.out.println(obj1);
//		}

	}

}
