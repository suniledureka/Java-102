package co.edureka.java.threads;

class Task1 implements Runnable{
	@Override
	public void run() {
		System.out.println("inside run() method");
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("run() method completes");
	}	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println();
		
		Task1 task = new Task1();
		Thread ct = new Thread(task);
		ct.start();
		
		System.out.println("no of threads = " + Thread.activeCount());
	}
}
