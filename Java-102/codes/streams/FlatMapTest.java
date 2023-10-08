package co.edureka.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		List<List<String>> list = new ArrayList<>();
		
		list.add(Arrays.asList("a","b","c"));
		list.add(Arrays.asList("d","e","f"));
		list.add(Arrays.asList("g","h","i"));
		list.add(Arrays.asList("j","k","l"));
		
		/*
		List<String> mappedList = list.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println(mappedList);
		*/
		
		/*
		List<String> mappedList = list.stream().flatMap(s -> s.stream().map(str -> str.toUpperCase())).collect(Collectors.toList());
		System.out.println(mappedList);
		*/
		
		
		List<String> mappedList = list.stream().flatMap(s -> s.stream()).filter(x -> "a".equals(x)).collect(Collectors.toList());
		System.out.println(mappedList);
		
	}

}
