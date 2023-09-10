package co.edureka.java.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println("no of participants = " + names.size());
		System.out.println("is empty = " + names.isEmpty());
		
		System.out.println(names + " | size = " + names.size());
		
		names.add("Sunil");
		names.add("Nikita");
		names.add("Sunil");
		names.add("Binu");
		names.add("Rajendran");
		names.add("Imran");
		names.add("Sunil");
		
		System.out.println(names + " | size = " + names.size());
		
		names.add(1,"Kalyani");
		names.set(1, "KALYANI");
		System.out.println(names + " | size = " + names.size());
		
		System.out.println("is \"Kalyani\" in list = " + names.contains("KALYANI"));
		System.out.println("is \"Sanjay\" in list = " + names.contains("Sanjay"));
		
		System.out.println();
		System.out.println("indexOf(Sunil) = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Sanjay) = " + names.indexOf("Sanjay"));
		System.out.println();
		
		System.out.println("person @ index 0 = " + names.get(0));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(Sunil) ---> " + names.remove("Sunil")); //true
		System.out.println("remove(0) ---> " + names.remove(0)); //KALYANI
		System.out.println(names + " | size = " + names.size());
		System.out.println();
		
		names.clear();
		System.out.println(names + " | size = " + names.size());
	}
}
