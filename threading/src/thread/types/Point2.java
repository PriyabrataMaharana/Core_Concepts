package thread.types;

class UserThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("This is an user thread....");
		}
	}
}

public class Point2 {
	public static void main(String[] args) {
		
		// Creating the UserThread
		UserThread2 userThread = new UserThread2(); 

		// Starting the thread
		userThread.start(); 

		// This statement will throw IllegalThreadStateException
		userThread.setDaemon(true); 
	}
}