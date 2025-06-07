package basic.Creation;

class MyThread1 implements Runnable {
	
    // initiated run method for Thread
    public void run()
    {
    	System.out.println("Thread Started Running...");
    }
}

public class UsingRunnable {

	public static void main(String[] args) {
		
		MyThread1 mt1 = new MyThread1();
		
		// Initializing thread object
		Thread t1 = new Thread(mt1);
		
		// Running thread
		t1.start();
	}
}
