package collectionsex;

import java.util.ArrayList;
import java.util.List;

import filestreamsex.FileStreamsEx;

public class ListEx1 {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		
		FileStreamsEx FisEx = new FileStreamsEx();
		
		list1.add(10);
		list1.add(100);
		list1.add(1001);
		list1.add(10.5F);
		list1.add(100.3643D);
		list1.add(1003643L);
		list1.add('A');
		list1.add("String1");
		list1.add(10);
		list1.add(FisEx);
		
		
		
//		System.out.println(list1);
//		System.out.println(list1.get(0));
//		
//		for(Object obj1:list1){
//			System.out.println(obj1);
//		}
		
		
		
		List list2 = new ArrayList();
		
		list2.add(10);
		list2.add("str");
		
		
		int int1 = (int)list2.get(0);
		System.out.println(int1);
		
		int int2 = (int)list2.get(1);
		
		System.out.println(int2);
		
		FileStreamsEx FisEx1 = new FileStreamsEx();
		
		List<FileStreamsEx> list3 = new ArrayList<FileStreamsEx>();
		
//		list3.add(10);
//		list3.add("Str");
//		list3.add(10.5);
//		list3.add(FisEx1);
		

	}

}
