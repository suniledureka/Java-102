package co.edureka.java.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {		
		List<String> names = Arrays.asList("Sanjay", "Arun", "Charles", "Bharath", "Pankaj", "Srinivas", "Chris", "Mark", "Sanjay");
		System.out.println(names);	
		
		

		//-- through lambda expression
		Comparator<String> customComparator = (String o1, String o2) -> {return o2.compareTo(o1);};		
		//Collections.sort(names, customComparator);
		names.sort(customComparator);
		System.out.println(names);
		
		//Collections.sort(names, (String o1, String o2) -> {return o2.compareTo(o1);});
		Collections.sort(names, (o1, o2) ->  o2.compareTo(o1));
		
		System.out.println(names);
	}

}
