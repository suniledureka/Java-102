package co.edureka.java.arrays;

import java.util.Arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		System.out.println(marks);
		System.out.println(Arrays.toString(marks));
		
		marks[0] = 92;
		marks[1] = 88;
		System.out.println("size of array = " + marks.length);
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i] + "     ");
		}
		System.out.println();
		
		float []salaries = new float[10];
		for(float sal : salaries) {
			System.out.print(sal + "    ");
		}
		System.out.println();
		
		boolean status[] = new boolean[9];
		for(boolean stat : status) {
			System.out.print(stat + "    ");
		}
		System.out.println();
		
		String[] names = new String[10];
		for(String name : names) {
			System.out.print(name + "    ");
		}
	}
}