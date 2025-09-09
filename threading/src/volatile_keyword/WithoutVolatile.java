package volatile_keyword;

public class WithoutVolatile extends Thread {
    boolean running = true; // not volatile

    public void run() {
        System.out.println("Thread started...");
        while (running) {
            // do nothing, waiting for flag to become false
        }
        System.out.println("Thread stopped.");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) throws Exception {
    	WithoutVolatile thread = new WithoutVolatile();
        thread.start();
        Thread.sleep(1000); // let the thread run for 1 sec
        thread.stopRunning(); // try to stop it
    }
}
