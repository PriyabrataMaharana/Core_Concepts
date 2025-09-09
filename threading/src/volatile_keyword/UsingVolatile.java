package volatile_keyword;


public class UsingVolatile extends Thread {
	
	// 👈 Now it's volatile
    volatile boolean running = true;

    public void run() {
        System.out.println("Thread started...");
        while (running) {
            // waiting for flag to become false
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) throws Exception {
        UsingVolatile thread = new UsingVolatile();
        thread.start();
        Thread.sleep(1000); // let it run
        thread.stopRunning(); // now the thread will see the change
    }
}

