package sample;

public class ConstructorEx1 {
	
	int a;
	int b;
	static int c = 300;
//	static ExampleClass1 ex1 = new ExampleClass1();
	
	ConstructorEx1(int a, int b){
		this.a = a;
		this.b= b;		
	}
	
	void addition(int a){	
		int d =a;
		System.out.println("Addition:"+ (a+b));
		System.out.println(c);
		System.out.println(d);
	}
	
	void additon1(){		
		System.out.println("Addition:"+ c);		
		System.out.println("a:"+this.a);
		System.out.println("b:"+this.b);
		
	}
	

	public static void main(String[] args) {
		ConstructorEx1 conEx1 = new ConstructorEx1(100,200);
		conEx1.additon1();
	}

}
