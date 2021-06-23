package polymorphismx;

public class OverloadingEx {

	int addition(int a, int b) {
//		System.out.println("Addition:" + (a + b));
		return a+b;
	}
	
	void multiplication(int a, int b) {
		System.out.println("Addition:" + (a * b));
	}
	
	void substraction(int a, int b) {
		System.out.println("Addition:" + (a - b));
	}
	
	static void division(int a, int b){
		System.out.println(a/b);
	}

	// void addition(byte a, int b){
	// System.out.println("Addition:"+(a+b));
	// }
	//
	// void addition(byte a, long b){
	// System.out.println("Addition:"+(a+b));
	// }
	//
	// void addition(int a, int b, int c){
	// System.out.println("Addition:"+(a+b+c));
	// }

}
