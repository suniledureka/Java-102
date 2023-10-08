package co.edureka.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest1 {

	public static void main(String[] args) {
		// -- to check whether a number is even or not
		Predicate<Integer> evenPredicate = n -> n % 2 == 0;
		int num = 13;
		boolean evenStatus = evenPredicate.test(num);
		if (evenStatus)
			System.out.println(num + " is EVEN");
		else
			System.out.println(num + " is NOT EVEN");

		System.out.println();

		// get the even numbers from a list of numbers
		List<Integer> nums = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		System.out.println("originial list = " + nums);
		
		//List<Integer> evenNums = nums.stream().filter(evenPredicate).collect(Collectors.toList());
		//List<Integer> evenNums = nums.stream().filter(n -> n%2==0).collect(Collectors.toList());
		List<Integer> evenNums = nums.stream().filter(n -> n%2==0).toList();
		System.out.println("evens list = " + evenNums);
		System.out.println();
		
		nums.stream().filter(n -> n%2 == 0).forEach(n -> System.out.println(n));
	}

}
