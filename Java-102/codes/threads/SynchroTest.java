package co.edureka.java.threads;

import java.util.concurrent.TimeUnit;

class Printer{
   //public void printTable(int n) {
	public synchronized void printTable(int n) {
	   for(int i=1; i<=10; i++) {
		   int p = n * i;
		   System.out.printf("%-2d x %-2d = %2d \n", n, i, p);
		   try {
			   Thread.sleep(1000);
		   }catch(Exception ex) {}
	   }
	   System.out.println("------------------------------------------------------------------------------");
	   try {
		   TimeUnit.SECONDS.sleep(4);//Thread.sleep(4000);
	   }catch(Exception ex) {}	   
   }
}

class ComputerThread1 extends Thread{
	Printer printer;
	int n;
	
	public ComputerThread1(Printer printer, int n) {
		super();
		this.printer = printer;
		this.n = n;
	}
	
	public void run() {
		printer.printTable(n);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;
	int n;
	
	public ComputerThread2(Printer printer, int n) {
		super();
		this.printer = printer;
		this.n = n;
	}
	
	public void run() {
		printer.printTable(n);
	}
}
public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();

		Thread t1 = new ComputerThread1(printer, 5);
		Thread t2 = new ComputerThread2(printer, 6);
		
		t1.start();
		t2.start();
	}

}
