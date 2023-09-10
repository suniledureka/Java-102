package co.edureka.java.wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		Float fl = Float.valueOf(12.5f);
		
		byte b = fl.byteValue();
		short s = fl.shortValue();
		int n = fl.intValue();
		long l = fl.longValue();
		
		float f = fl.floatValue();
		double d = fl.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
	}
}
