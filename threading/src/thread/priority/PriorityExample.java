package thread.priority;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread: " + getName() + ", Priority: " + getPriority());
    }
}

public class PriorityExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Set names
        t1.setName("LowPriorityThread");
        t2.setName("NormalPriorityThread");
        t3.setName("HighPriorityThread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);    // 1
        t2.setPriority(Thread.NORM_PRIORITY);   // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);    // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}

