package co.edureka.java.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>(new NamesComparator());

		names.add("Mark");
		names.add("Mark"); 
		names.add("Prakash"); 
		names.add("Charles");
		names.add("Rahul");
		names.add("Sujith");
		names.add("Anil");
		
		System.out.println(names);
		System.out.println("no of participants = " + names.size());
	}
}

class NamesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		//return 0;
		//return 1;
		//return -1;
		int n = o1.compareTo(o2);
		if(n > 0)
			return -1;
		else if(n < 0)
			return 1;
		else
			return 0;
	}
	
}