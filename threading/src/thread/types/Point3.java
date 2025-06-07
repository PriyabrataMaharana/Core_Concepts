package thread.types;

class UserThread3 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("This is an user thread...");
		}
	}
}

public class Point3 {
	public static void main(String[] args) {
		//Creating the UserThread
		UserThread3 userThread = new UserThread3();

		System.out.println(userThread.isDaemon()); // Output : false

		// changing the thread as Daemon
		userThread.setDaemon(true);

		// Starting the thread
		userThread.start();

		System.out.println(userThread.isDaemon()); // Output : true
	}
}
