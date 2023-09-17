package co.edureka.java.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11250.5f)); //25000.0
		System.out.println(bank.put("Anil", 27500f)); //null
		
		bank.put("Charles", 25700f);
		bank.put("Pankaj", 12500.75f);
		bank.put("Rahul", 25000f);
		
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal += 1250.5f;
		bank.put("Sunil", bal);
		System.out.println(bank);
		System.out.println();
		
		Set<String> accHolders = bank.keySet();
		System.out.print("A/C Holders -------> ");
		accHolders.forEach(name -> System.out.print(name + "  |  "));
		System.out.println("\n");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			Float balance = entry.getValue();
			System.out.printf("%-10s ---> %.2f \n", name, balance);
		}
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}
}
