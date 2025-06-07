package thread.yield;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - iteration " + i);

            if (i == 3) {
                System.out.println(getName() + " yielding at iteration " + i);
                Thread.yield();  // Suggests pausing to let other threads run
            }
        }
    }
}

public class YieldExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
