package co.edureka.java.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListIterations {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(87,96,74,83,92,77,81);
		
		iterate1(marks);
		iterate2(marks);
		iterate3(marks);
		iterate4(marks);
		iterate5(marks);
		iterate6(marks);
	}

	private static void iterate1(List<Integer> marks) {
		System.out.println(">>> list iteration using for loop & get() method ---> only for java.util.List implementations");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n+"       ");
		}
		System.out.println("\n");
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}
	}

	private static void iterate2(List<Integer> marks) {
		System.out.println(">>> list iteration using for...each loop");
		for(Integer n : marks) {
			System.out.print(n+"       ");
		}
		System.out.println("\n");
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}		
	}	
	
	private static void iterate3(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"       ");
		}
		System.out.println("\n");
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}		
	}
	
	private static void iterate4(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.ListIterator ---> only for java.util.List implementations");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"       ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"       ");
		}		
		System.out.println("\n");
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}		
	}	
	
	private static void iterate5(List<Integer> marks) {
		System.out.println(">>> list iteration using java.util.Enumeration");		
		Enumeration<Integer> en = Collections.enumeration(marks); 
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"       ");
		}
		System.out.println("\n");
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {}		
	}	
	
	private static void iterate6(List<Integer> marks) {
		System.out.println(">>> list iteration using forEach method with Consumer lambda");
		/*
		//-- using anonymous class concept
		marks.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t + "       ");				
			}			
		});
		*/
		//-- using lambda expression
		//marks.forEach((Integer t) -> System.out.print(t + "       "));		
		marks.forEach(t -> System.out.print(t + "       "));
		System.out.println("\n");
	}		
}
