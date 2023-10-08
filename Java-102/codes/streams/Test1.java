package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		System.out.println("no of participants = " + names.size());
		Stream<String> namesStr = names.stream();
		System.out.println("no of participants = " + namesStr.count());
		System.out.println();
		
		long count = names.stream().filter(name -> name.length() > 5 ? true : false).count();
		System.out.println("no of people whole name length is > 5 = " + count);
		
		List<Integer> nums = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
		List<Integer> evenNums = nums.stream().filter(n -> n%2==0?true:false).collect(Collectors.toList());
		
		System.out.println("complete numbers ---> " + nums);
		System.out.println("even numbers     ---> " + evenNums);
		
		//get all names in caps
		List<String> namesInUpper = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesInUpper);
	}

}
