package interfaceex;

class Example1 implements InterfaceEx1,InterfaceEx2,InterfaceEx3 {

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
	
	

}
