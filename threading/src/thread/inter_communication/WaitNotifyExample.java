package thread.inter_communication;

class CommonData {
    boolean ready = false;

    public synchronized void produce() {
        System.out.println("Producer is producing data...");
        ready = true;
        System.out.println("Producer finished. Notifying consumer...");
        notify();  // Notify consumer
    }

    public synchronized void consume() {
        while (!ready) {
            try {
                System.out.println("Consumer is waiting...");
                wait();  // Wait until producer notifies
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer consumed the data.");
    }
}

class Producer extends Thread {
    CommonData data;

    Producer(CommonData data) {
        this.data = data;
    }

    public void run() {
        data.produce();
    }
}

class Consumer extends Thread {
    CommonData data;

    Consumer(CommonData data) {
        this.data = data;
    }

    public void run() {
        data.consume();
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        CommonData data = new CommonData();

        Consumer consumer = new Consumer(data);
        Producer producer = new Producer(data);

        consumer.start();  // Start consumer first to wait
        try {
            Thread.sleep(1000); // Make sure consumer waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        producer.start();  // Start producer to notify
    }
}

