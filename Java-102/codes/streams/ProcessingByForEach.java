package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ProcessingByForEach {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		names.forEach(name -> System.out.print(name + "      "));
		System.out.println();
		
		//display each name in upper case using stream
		names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name+"     "));
		System.out.println();
		
		//using method reference
		names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		//to get odd numbers from a list
		List<Integer> nums = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		nums.stream().filter(num -> num%2==1).forEach(n -> System.out.print(n+"     "));
	}

}
