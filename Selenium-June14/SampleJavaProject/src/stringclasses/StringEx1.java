package stringclasses;

public class StringEx1 {

	public static void main(String[] args) {
				
		String str1 = "Hello Java";
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.split(" ")[0]);
		
		System.out.println(str1.concat(" Selenium"));
		System.out.println(str1);
		
		String str3 = str1.concat(" Selenium");
		System.out.println(str3);
		
		String str2 = "12abCD34%%&&";	
		
		System.out.println(str2.replaceAll("[^0-9]", ""));
		
		String string1 = "Selenium";
		
		String string2 = new String("Selenium");
		
		System.out.println(string1==string2);
		
		System.out.println(string1==string2.intern());
		
		
		int int1= 100;
		
		
		Integer int2 = 100;
		
		Integer int3 = new Integer(100);
		
		System.out.println(int1==int3);
		
		

	}

}
