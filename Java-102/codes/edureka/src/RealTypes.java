
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.5; //Type mismatch: cannot convert from double to float
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float)2500.5;
		System.out.println("my salary = " + sal);
		
		//double data = 2750.75;
		//double data = 2750.75d;
		double data = 2750.75D;
		System.out.println(data);
		
		System.out.println("hexa decimal value of 65 = " + Integer.toHexString(65));
	}
}