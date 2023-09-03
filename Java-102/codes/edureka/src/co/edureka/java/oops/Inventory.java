package co.edureka.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		
		prod.setProductId(100123);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(72000f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		System.out.println();
		
		System.out.println("prod is of Type --> " + prod.getClass().getName());
		System.out.println("prod is of Type --> " + prod.getClass().getSimpleName());
		
		int hashCode = prod.hashCode();
		System.out.println("hashCode() = " + hashCode);
		System.out.println("hashCode() in Hex Decimal Form = " + Integer.toHexString(hashCode));
		System.out.println();
		
		System.out.println(prod); //toString()
	}
}