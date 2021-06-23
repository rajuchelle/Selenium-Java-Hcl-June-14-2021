package sample;

public class ExampleClass1 {
	
	int a = 100;
	int b = 200;
	static int c = 300;
	static ExampleClass1 ex1 = new ExampleClass1();
	
	void addition(int a){	
		int d =a;
		System.out.println("Addition:"+ (a+b));
		System.out.println(c);
		System.out.println(d);
	}
	
	static void additon1(){		
		System.out.println("Addition:"+ c);		
		System.out.println(ex1.a);
		System.out.println(ex1.b);
		
	}
	
	public static void main(String[] args) {		
		
//		additon1();
		
		byte b1 = 127;
		
		long l1 = b1;
		
		String str = "100";
		
		int int1 = Integer.parseInt(str);
		
		byte b2 = Byte.parseByte(str);
		
		int x = 100;
		int y  = 200;
		
//		boolean bool = (x == y); //true/false //+,*,/,%,-
		System.out.println(x == y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		
		System.out.println(x < y || x==y);
		System.out.println(x < y && x==y);
		System.out.println(x!=y);
		
		System.out.println(x<y?"Pass":"Fail");
					
	}
	
}

