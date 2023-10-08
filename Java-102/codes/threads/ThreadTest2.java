package co.edureka.java.threads;

class Task2 extends Thread{
	@Override
	public void run() {
		System.out.println("inside run() method");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("run() method completes");
	}	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println();
		
		Thread ct = new Task2();
		ct.start();
		
		System.out.println("no of threads = " + Thread.activeCount());
	}
}

