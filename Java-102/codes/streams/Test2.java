package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);
		System.out.println("original list = " + nums);
		
		//--- filtering to generate even numbers from list
		/*
		Stream<Integer> numsStream = nums.stream();
		Stream<Integer> evenNumsStream = numsStream.filter(num -> num%2==0);
		List<Integer> evenNums = evenNumsStream.collect(Collectors.toList());
		System.out.println("even numbers = " + evenNums);
		*/
		List<Integer> evenNums = nums.stream().filter(num -> num%2==0).collect(Collectors.toList());
		System.out.println("even numbers = " + evenNums);
		System.out.println();
		
		//--- mapping to multiply each element with 10
		List<Integer> mappedNums = nums.stream().map(n -> n*10).collect(Collectors.toList());
		System.out.println(mappedNums);		
	}
}
