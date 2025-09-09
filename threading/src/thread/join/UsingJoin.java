package thread.join;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

public class UsingJoin {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        try {
            t1.join();  // Main thread will wait here until t1 completes
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread continues after MyThread is finished.");
    }
}

