package fuctionalInterfaces;

public class UseFunctionalInterface1 {
	
	static InterfaceFunctional1 interFun1 = new InterfaceFunctional1(){
		@Override
		public void method1(){
			System.out.println("This is Functional Interface method1");
		}
	};
	
	static InterfaceFunctional1 interFun2 = ()->{System.out.println("This is Functional Interface lambda method1");};
	
	
	public static void main(String[] args) {
		interFun1.method1();
		interFun2.method1();

	}

}
