package co.edureka.java.strings;

public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb + " |size= "+sb.length() + " | Capacity= "+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb + " |size= "+sb.length() + " | Capacity= "+sb.capacity());
		
		sb.append(" 007");
		System.out.println(sb + " |size= "+sb.length() + " | Capacity= "+sb.capacity());
		
		sb.insert(0, "1. ");
		System.out.println(sb + " |size= "+sb.length() + " | Capacity= "+sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
	}

}
