package multipleCall;

//Class extending thread
class MyThread extends Thread {
	// Overriding the run method
	@Override
	public void run() {
		System.out.println("Current thread name: " + Thread.currentThread().getName());
		System.out.println("run() method called");
	}
}

//Driver class
public class Demo {
	public static void main(String[] args) {
		// thread created
		MyThread t = new MyThread();
		t.run();
		t.run();
	}
}
