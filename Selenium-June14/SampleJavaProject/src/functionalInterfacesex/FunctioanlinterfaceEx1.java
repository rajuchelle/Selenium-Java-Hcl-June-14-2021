package functionalInterfacesex;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.google.common.base.Function;

public class FunctioanlinterfaceEx1 {
	
	//Function
	//Predicate	
	//Consumer
	static Function<String, Integer> fun1 = new Function<String, Integer>() {

		@Override
		public Integer apply(String arg0) {
			// TODO Auto-generated method stub
			return 100;
		}
	};
	
	static Function<String, Integer> fun2 = (value1)->{return 500;};
	
	
	static Predicate<Integer> predicate1 = new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			if(t==100){
				return true;
			}else{
				return false;	
			}
			
		}
	};
	
	static Predicate<Integer> predicate2 = (value1)->{return value1==100;};
	
	static Consumer<String> consumer1 = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t);
			
		}
	};

	public static void main(String[] args) {
//		System.out.println(fun2.apply("Hello")); 
		
//		System.out.println(predicate2.test(101));
		
		consumer1.accept("Hello");

	}

}
