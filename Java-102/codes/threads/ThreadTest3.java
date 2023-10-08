package co.edureka.java.threads;

class Natural extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.printf("%-8s - %d\n",Thread.currentThread().getName().toUpperCase(),i);
		}
	}
}

class Even extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.printf("%-8s - %d\n",Thread.currentThread().getName().toUpperCase(),(i*2));
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		Thread t1 = new Natural(); 
		Thread t2 = new Even();
		
		t1.setName("NATURAL");
		t2.setName("EVEN");
		
		t1.start();
		t2.start();
	}
}
