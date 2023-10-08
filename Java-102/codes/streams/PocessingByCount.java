/**
 * requirement to find the number of participants and also to 
 * find the number of participants whose name size is greater than 5 
*/
package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;

public class PocessingByCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		System.out.println("no of participants = " + names.size());
		System.out.println("no of participants = " + names.stream().count());
		System.out.println();
		
		//number of participants whose name got more than 5 character length
		long noOfPartGreThan5 = names.stream().filter(name -> name.length() > 5).count();
		System.out.println("no of participants whose name is > 5 character length = " + noOfPartGreThan5);
	}

}
