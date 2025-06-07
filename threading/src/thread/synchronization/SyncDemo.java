package thread.synchronization;

public class SyncDemo {
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        public void decrement() {
            synchronized(this) {
                count--;
                System.out.println(Thread.currentThread().getName() + " decremented count to " + count);
                try { Thread.sleep(100); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }

    static class IncrementThread extends Thread {
        private Counter counter;
        IncrementThread(Counter counter) {
            this.counter = counter;
        }
        public void run() {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }
    }

    static class DecrementThread extends Thread {
        private Counter counter;
        DecrementThread(Counter counter) {
            this.counter = counter;
        }
        public void run() {
            for (int i = 0; i < 5; i++) {
                counter.decrement();
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new IncrementThread(counter);
        t1.setName("Thread-Increment");

        Thread t2 = new DecrementThread(counter);
        t2.setName("Thread-Decrement");

        t1.start();
        t2.start();
    }
}

