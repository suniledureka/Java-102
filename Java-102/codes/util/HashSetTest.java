package co.edureka.java.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();

		System.out.println(names.add("Mark")); //true
		System.out.println(names.add("Mark")); //false
		System.out.println(names.add("Prakash")); //true
		names.add("Charles");
		names.add("Rahul");
		names.add("Sujith");
		names.add("Anil");
		
		System.out.println(names);
		System.out.println("no of participants = " + names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("------> " + name);
		}
		
		names.add(null);
		System.out.println(names);
	}

}
