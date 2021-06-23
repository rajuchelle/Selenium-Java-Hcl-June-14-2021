package polymorphismx;

public class Example1 extends OverloadingEx {

	void addition(int a, int b, int c) {
		System.out.println("Addition:" + (a + b + c));
	}
	
	int addition(int a, int b) {
//		System.out.println("Addition:" + ((a + b)+1));
		
		int result =  ((super.addition(a, b))+1);
		return result;
	}
	
//	static void division(int a, int b){
//		System.out.println(a/b);
////		return 100;
//	}

	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		System.out.println(ex1.addition(100, 200));
		ex1.substraction(100, 200);
//		ex1.addition(100, 200,300);
	}

}
