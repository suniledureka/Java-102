package co.edureka.java.oops;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = null;
		
		long acno;
		String name;
		float amt;
		
		while(true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.println();
			System.out.print("enter an option: ");
			int opt = sc.nextInt();
			System.out.println();
			
			switch(opt) {
			 case 1:
				if(acc == null) {
					System.out.print("enter a/c no: ");
					acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("enter name: ");
					name = sc.nextLine();
					
					System.out.print("enter initial deposit: ");
					amt = sc.nextFloat();
					
					acc = new Account(acno, name, amt);
					System.out.println("$$$--- THANKS FOR OPENING A/C WITH US ---$$$");
				}else {
					System.out.println("###--- ACCOUNT IS WITH US ---###");
				}				 
				break;
			 case 2:
				if(acc != null) {
					System.out.print("enter the amount to deposit: ");
					amt = sc.nextFloat();						
					acc.deposit(amt);
				}else {
					System.out.println("###--- PLEASE OPEN AN ACCOUNT WITH US ---###");
				}				 
				break;
			 case 3:
				if(acc != null) {
					System.out.print("enter the amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.out.println("###--- PLEASE OPEN AN ACCOUNT WITH US ---###");
				}				 
				break;
			 case 4:
				if(acc != null) {
					acc.getBalance();
				}else {
					System.out.println("###--- PLEASE OPEN AN ACCOUNT WITH US ---###");
				}
				break;
			 case 5:
				System.out.println("application designed & developed by team @ edureka");
				System.exit(0); //to terminate the application
				break;
			 default:
				System.out.println("###--- INVALID OPTION --- TRY AGAIN ---###"); 
			}//switch
			System.out.println("------------------------------------------------------------------\n");
		} //while

	}

}
