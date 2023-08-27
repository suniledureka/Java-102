import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name: ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.printf("Welcome %s ", name);
	}

}
