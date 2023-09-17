package co.edureka.java.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();

		System.out.println(names.add("Mark")); //true
		System.out.println(names.add("Mark")); //false
		System.out.println(names.add("Prakash")); //true
		names.add("Charles");
		names.add("Rahul");
		names.add("Sujith");
		names.add("Anil");
		
		System.out.println(names);
		System.out.println("no of participants = " + names.size());
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}
}
