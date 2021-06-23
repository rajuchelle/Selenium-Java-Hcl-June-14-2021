package functionalInterfacesex;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(21);
		list1.add(31);
		
		list1.stream().filter((value1)->{return ((int)value1%2)==0;})
		.forEach((value2)->System.out.println(value2));

	}

}
