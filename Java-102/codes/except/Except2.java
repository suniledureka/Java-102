package co.edureka.java.except;

public class Except2 {

	public static void main(String[] args) {
		String str = "854"; 
		System.out.println(str + 5); //8545
		
		int n = Integer.parseInt(str);
		System.out.println(n + 5); //859
		
		n = Integer.parseInt("A");
		System.out.println(n);
	}
}