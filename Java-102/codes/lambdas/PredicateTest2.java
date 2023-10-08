package co.edureka.java.lambdas;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		//-- a predicate to check whether a give number is greater than 10 or not
		Predicate<Integer> p = n -> n>10;
		int num=12;
		System.out.println(p.test(num));
		System.out.println(p.test(9));
		
		//-- a predicate to check the length of a String is > 4 or not
		Predicate<String> p1 = str -> str.length() > 4;
		System.out.println(p1.test("edureka"));
		System.out.println(p1.test("ABC"));
		
		//-- a predicate to check whether a Collection is empty or not
		Predicate<Collection> p2 = datas -> datas.isEmpty();
		System.out.println("is collection empty = " +  p2.test(Arrays.asList(10,20)));
		System.out.println("is collection empty = " +  p2.test(Arrays.asList()));
	}
}