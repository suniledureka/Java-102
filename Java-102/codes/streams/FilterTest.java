package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
		System.out.println("orginal list of numbers = " + numbers);
		System.out.println();

		Stream<Integer> numsStream = numbers.stream();
		Stream<Integer> evenNumsStream = numsStream.filter(n -> n%2==0);
		List<Integer> evenNums = evenNumsStream.collect(Collectors.toList());
		System.out.println("even numbers list = " + evenNums);
	}

}
