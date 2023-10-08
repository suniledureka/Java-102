package co.edureka.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task3 implements Runnable{
	public void run() {
		System.out.println("Running Thread = " + Thread.currentThread().getName());	
		try {
			TimeUnit.SECONDS.sleep(10);
		}catch(Exception ex) {}
		System.out.println("Completing Thread = " + Thread.currentThread().getName());
	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);//creating a pool of 3 threads  
		
		executor.execute(new Task3());
		executor.execute(new Task3());
		executor.execute(new Task3());
		executor.execute(new Task3());
		executor.execute(new Task3());
	}

}
