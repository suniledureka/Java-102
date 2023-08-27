package co.edureka.java.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] marks_10 = new int[4][];
		
		marks_10[0] = new int[12];
		marks_10[1] = new int[8];
		marks_10[2] = new int[10];
		marks_10[3] = new int[5];
		
		System.out.println("size of array = " + marks_10.length);
		System.out.println();
		
		for(int i=0; i<marks_10.length; i++) {
			System.out.println("size of marks_10["+i+"] = " + marks_10[i].length);
		}		
		System.out.println();
		
		/*--- display array elements in a matrix form ---*/
		for(int i=0; i<marks_10.length; i++) {
			for(int j=0; j<marks_10[i].length; j++) {
				System.out.print(marks_10[i][j] + "       ");
			}
			System.out.println();
		}		
	}

}
