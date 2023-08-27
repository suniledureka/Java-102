package co.edureka.java.arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {85,76,92,81,77,93};
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		/*-- array iteration using for loop --*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for Subject-"+ (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		System.out.print("marks obtained --->  ");
		/*-- array iteration using enhanced for loop (for..each loop) from Java 5 --*/
		for(int mark : marks) {
			System.out.print(mark + "  |  ");
		}
		System.out.println();
		
		System.out.println(marks[5]); //93
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
