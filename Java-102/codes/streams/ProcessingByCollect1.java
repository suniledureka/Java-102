package co.edureka.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingByCollect1 {

	public static void main(String[] args) {
		List<String> participantsName = Arrays.asList("ashutosh", "bhargav", "debkumar", "dhivya", "anil");
		System.out.println("original participant names = " + participantsName);
		System.out.println();

		List<String> namesInCaps = participantsName.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println("names in capital letters = " + namesInCaps);
	}
}