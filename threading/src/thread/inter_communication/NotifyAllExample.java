package thread.inter_communication;

class CommonCounter {
    boolean ready = false;

    public synchronized void markReady() {
        ready = true;
        System.out.println("Notifier: Task done, notifying all...");
        notifyAll();  // Wake up all waiting threads
    }

    public synchronized void waitForReady(String name) {
        while (!ready) {
            try {
                System.out.println(name + " is waiting...");
                wait();  // All threads wait here
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " got notified and proceeds.");
    }
}

class WaitingThread extends Thread {
    CommonCounter counter;
    String threadName;

    WaitingThread(CommonCounter counter, String name) {
        this.counter = counter;
        this.threadName = name;
    }

    public void run() {
        counter.waitForReady(threadName);
    }
}

public class NotifyAllExample {
    public static void main(String[] args) {
        CommonCounter counter = new CommonCounter();

        WaitingThread w1 = new WaitingThread(counter, "Thread-1");
        WaitingThread w2 = new WaitingThread(counter, "Thread-2");
        WaitingThread w3 = new WaitingThread(counter, "Thread-3");

        w1.start();
        w2.start();
        w3.start();

        try {
            Thread.sleep(2000); // Ensure all threads are waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        counter.markReady();  // Notifier thread not shown, called in main for simplicity
    }
}

