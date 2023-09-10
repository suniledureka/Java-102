package co.edureka.java.except;

public class ExceptPropagation {

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		method2();		
	}

	private static void method2() {
		int x = 10;
		int y = 0;
		int z = x / y;
		System.out.println("result = " + z);
		System.out.println("----- done -----");		
	}
}
