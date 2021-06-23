package interfaceex;

public class Example2{
	
	 static InterfaceEx1 infEx1 = new InterfaceEx1(){

		 @Override
			public void method1() {
				System.out.println("Interface method1");

			}

			@Override
			public void method2() {
				System.out.println("Interface method2");

			}
			
			@Override
			public void method3() {
				System.out.println("Interface method3");
				
			}

			@Override
			public void method4() {
				System.out.println("Interface method4");
				
			}

			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);
				
			}		 
	 };

	public static void main(String[] args) {
		
		infEx1.addition(10,20);
	}

	

}
