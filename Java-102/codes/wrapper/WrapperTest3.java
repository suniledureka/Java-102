package co.edureka.java.wrapper;

public class WrapperTest3 {

	public static void main(String[] args) {
		int n1 = 26;
		Integer n2 = n1; //auto-boxing
		int n3 = n2; //auto-unboxing
		
		System.out.println(n1 + " | " + n2 + " | " + n3);
		
		Integer no1 = Integer.valueOf(25);
		Integer no2 = Integer.valueOf(26);
		Integer no3 = no1 + no2; //unboxing, add, boxing
		System.out.println(no1 + " + " + no2 + " = " + no3);
	}
}