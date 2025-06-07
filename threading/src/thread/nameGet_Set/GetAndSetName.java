package thread.nameGet_Set;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class GetAndSetName {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Setting thread names
        t1.setName("Worker-1");
        t2.setName("Worker-2");

        // Starting threads
        t1.start();
        t2.start();

        // Getting thread names from main
        System.out.println("Thread 1 Name: " + t1.getName());
        System.out.println("Thread 2 Name: " + t2.getName());
    }
}

