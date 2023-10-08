package co.edureka.java.lambdas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<LocalDate> supplier = () -> LocalDate.now();
		System.out.println(supplier.get());
		
		//List<String> courses = Arrays.asList("Java", "Python");
		List<String> courses = Arrays.asList();
		System.out.println(courses.stream().findAny().orElseGet(()->"Course Names List is Empty"));
		
	}

}
