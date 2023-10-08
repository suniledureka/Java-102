package co.edureka.java.lambdas;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		Function<String, String> function = (name) -> name.toUpperCase();
		
		String data = function.apply("wipro");
		System.out.println(data);
		
		Function<String, Integer> lengthTask = str -> str.length();
		String cname = "Wipro";
		Integer length = lengthTask.apply(cname);
		System.out.println("length of \""+cname+"\" = " + length);
	}

}
