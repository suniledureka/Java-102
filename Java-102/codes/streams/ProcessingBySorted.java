package co.edureka.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBySorted {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50, 82);
		System.out.println("original marks order = " + marks);
		System.out.println();
		
		List<Integer> marksInOrderAsc = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("marks in ascending order = " + marksInOrderAsc);
		System.out.println();
		/*
		List<Integer> marksInOrderDesc = marks.stream().sorted((Integer o1, Integer o2) -> {
				int n = o1.compareTo(o2)>0?-1:1;
				return n;
			}).collect(Collectors.toList());
		*/
		List<Integer> marksInOrderDesc = marks.stream().sorted((m1, m2) -> m2-m1).collect(Collectors.toList());
		System.out.println("marks in descending order = " + marksInOrderDesc);
		System.out.println();
		
		
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		
		List<String> namesAsc = names.stream().sorted().collect(Collectors.toList());
		System.out.println(namesAsc);
		
		List<String> namesAsc1 = names.stream().sorted((name1, name2) -> name1.compareToIgnoreCase(name2)).collect(Collectors.toList());
		System.out.println(namesAsc1);
	}
}