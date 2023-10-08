package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToIntTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("3", "6", "8", "14", "15");
		
		IntStream intStream = list.stream().mapToInt(num -> Integer.parseInt(num));		
		intStream.forEach(num -> System.out.println(num));
	}

}
