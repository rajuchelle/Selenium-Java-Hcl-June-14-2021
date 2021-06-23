package polymorphismx;

import abstractionex.AbstracctionEx1;

public class Example2{

	void modularDivision(int a, int b){
		System.out.println(a%b);
			
	}
	
	
//	@Override
//	public int addition(int a, int b) {		
//		return a+b;
//	}
	
	AbstracctionEx1 absex1 = new AbstracctionEx1() {
		
		@Override
		public int addition(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	
	
	public static void main(String[] args) {
		Example2 ex2 = new Example2();
//		ex2.substraction(200,100);		
//		System.out.println(ex2.addition(100,200));		
//		
//		AbstracctionEx1 absEx1 = ex2;
//		
////		absEx1.modularDivision();
//		
//		absEx1.addition(100,200);	
		ex2.absex1.multiplication(10, 20);

	}

	

}
