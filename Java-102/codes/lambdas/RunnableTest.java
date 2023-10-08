package co.edureka.java.lambdas;


public class RunnableTest {

	public static void main(String[] args) {
		/*
		Runnable runRef = new Runnable() {
			public void run() {
				for(int i=1; i<=10; i++) {
					try {
						System.out.println(Thread.currentThread().getName() + " -- " + i);
						Thread.sleep(1000);
					}catch(Exception ex) {}
				}
			}
		};
		*/
		
		/*
		Runnable runRef = () -> {
			for(int i=1; i<=10; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + " -- " + i);
					Thread.sleep(1000);
				}catch(Exception ex) {}
			}
		};
		
		Thread ct = new Thread(runRef);
		ct.start();
		*/
		
		Thread ct = new Thread(() -> {
			for(int i=1; i<=10; i++) {
				try {
					System.out.println(Thread.currentThread().getName() + " -- " + i);
					Thread.sleep(1000);
				}catch(Exception ex) {}
			}
		});
		
		ct.start();
	}
}
