package co.edureka.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest1 {

	public static void main(String[] args) {
		Consumer<String> conRef = (name) ->  System.out.println("Hi " + name.toUpperCase() + ", Welcome to edureka");			   
		conRef.accept("Sunil");
		System.out.println();
		
		List<String> names = Arrays.asList("Sanjay", "Arun", "Charles", "Bharath", "Pankaj", "Srinivas");
		names.forEach(conRef); //Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception
		System.out.println();
		
		names.forEach(name -> System.out.print(name+", "));
	}

}
