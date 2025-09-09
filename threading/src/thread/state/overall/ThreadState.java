package thread.state.overall;

class MyThread implements Runnable {
    public void run() {
        // Set the thread to sleep (inactive) to simulate waiting
        try {
            Thread.sleep(102);
        } catch (InterruptedException i1) {
            i1.printStackTrace();
        }

        System.out.println("The state for t1 after it invoked join() on thread t2: "
                            + ThreadState.t1.getState());

        // Sleep again to simulate longer activity
        try {
            Thread.sleep(202);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }
    }
}

// Creation of ThreadState class
public class ThreadState implements Runnable {
    public static Thread t1; 
    public static ThreadState o1;

    public void run() {
        MyThread myThread = new MyThread();
        Thread t2 = new Thread(myThread);

        // Thread t2 created – NEW state
        t2.start();

        // Now t2 is in RUNNABLE state
        System.out.println("State of t2 after calling start(): " + t2.getState());

        try {
            Thread.sleep(202);
        } catch (InterruptedException i2) {
            i2.printStackTrace();
        }

        System.out.println("State of t2 after sleep(): " + t2.getState());

        try {
            t2.join(); // Wait for t2 to finish
            System.out.println("State of t2 after join(): " + t2.getState());
        } catch (InterruptedException i3) {
            i3.printStackTrace();
        }

        System.out.println("State of t1 after t2 completes: " + t1.getState());
    }

    public static void main(String args[]) {
        o1 = new ThreadState();
        t1 = new Thread(o1);

        System.out.println("Initial state of t1: " + t1.getState());

        t1.start();

        System.out.println("State of t1 after start(): " + t1.getState());
    }
}

