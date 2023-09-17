package co.edureka.java.util;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new Hashtable<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11250.5f)); //25000.0
		System.out.println(bank.put("Anil", 27500f)); //null
		
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		//bank.put("Praveen", null); //java.lang.NullPointerException
		bank.put(null, 25000f); //java.lang.NullPointerException
		System.out.println(bank);
	}

}
