package co.edureka.java.lambdas;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		Predicate<Integer> oddEvenPredicate = (Integer t) -> t%2==0;
		
		int n = 26;
		boolean isEven = oddEvenPredicate.test(n);
		System.out.println("is " + n + " even ---> " + isEven);
	}

}
