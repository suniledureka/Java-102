/**
 * to get only even numbers from a List/ArrayList
*/

package co.edureka.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingByCollect {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=11; i<=20; i++) {
			list.add(i);
		}
		System.out.println("complete numbers = " + list);
		System.out.println();
		
		//solutions-1 :: without using Stream
		List<Integer> evensList = new ArrayList<Integer>();
		for(int n : list) {
			if(n%2 == 0) {
				evensList.add(n);
			}
		}
		System.out.println("even numbers = " + evensList);
		System.out.println();
		
		//solution-2 :: using Stream API
		/*
		Stream<Integer> stream1 = list.stream();		
		Stream<Integer> stream2 = stream1.filter(n -> n%2==0); //configuration
		List<Integer> evenNums1 = stream2.collect(Collectors.toList()); //processing
		*/
		List<Integer> evenNums1 = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println("even numbers = " + evenNums1);
	}
}