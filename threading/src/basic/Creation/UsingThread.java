package basic.Creation;

class MyThread extends Thread {
	
    // initiated run method for Thread
    public void run()
    {
        System.out.println("Thread Started Running...");
    }
}

public class UsingThread {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();	// Thread object instantiated
		t1.start();				// Thread got activated -- search the run method
		System.out.println(t1.isDaemon());
	}
}
