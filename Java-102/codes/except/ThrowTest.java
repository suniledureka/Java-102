package co.edureka.java.except;

public class ThrowTest {
	
	void calc(int x, int y) {
		if(y == 0)
			throw new RuntimeException("cannot divide by zero");
		
		int z = x / y;
		System.out.println("result = " + z);
	}
	
	public static void main(String[] args) {
		ThrowTest obj = new ThrowTest();
		try {
			obj.calc(10, 0);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

}
