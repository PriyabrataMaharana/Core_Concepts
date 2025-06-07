package thread.pool;

import java.util.concurrent.*;

class MyTask implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is executing the task");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPoolExample {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 6; i++) {
			executor.submit(new MyTask());
		}

		executor.shutdown(); // Required to stop after finishing tasks
	}
}
