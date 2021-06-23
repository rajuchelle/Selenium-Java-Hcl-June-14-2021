package sample;

import java.util.ArrayList;
import java.util.List;

public class ClassEx1 {

	class InnerClass1 {
		void method2() {
			System.out.println("Inner Instance class method1");
		}

	}

	static class StaticInnnerClass {
		static int method1() {
			System.out.println("This is Static Innner class");
			return 100;
		}
	}

	// {
	// System.out.println("This is Instnnace Annonymus class");
	// }

	static {
		System.out.println("This is Static Annonymus class");
	}

	public static void main(String[] args) {
		int staticInner = ClassEx1.StaticInnnerClass.method1();
		ClassEx1.InnerClass1 innerCls = new ClassEx1().new InnerClass1();
		innerCls.method2();

	}

}
