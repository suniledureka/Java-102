package co.edureka.java.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first number: ");
			int no1 = sc.nextInt();
			
			System.out.print("enter second number: ");
			int no2 = sc.nextInt();
			
			int res = no1 / no2;
			System.out.println("result = " + res);
			//return;
			//System.exit(0);
		}catch(ArithmeticException ex) {
			System.err.println("inside catch block");
			System.out.println(ex);
		}finally {
			System.out.println("inside finally block");
			System.out.println("application designed & developed by");
			System.out.println("team @ edureka");
			sc.close();
		}
		System.out.println("----- done -----");
	}

}
