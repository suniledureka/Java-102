import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which numbers multiplication table? ");
		int num = sc.nextInt();
		
		printTable(num);
	}

	static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int p = n * i;
			//System.out.printf("%d x %d = %d \n", n, i, p);
			System.out.printf("%-2d x %2d = %2d \n", n, i, p);
		}
	}

}
