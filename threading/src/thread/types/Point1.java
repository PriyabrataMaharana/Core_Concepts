package thread.types;

class UserThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("This is an user thread....");
		}
	}
}

public class Point1 {
	// Main Thread
	public static void main(String[] args) {
		// Creating the UserThread
		UserThread1 userThread = new UserThread1(); 

		// Changing the thread as Daemon
		userThread.setDaemon(true); 

		// Starting the thread
		userThread.start(); 
	}
}
