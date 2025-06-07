package thread.sleep;

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running... Count: " + i);
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class UsingSleep {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("MyThread: " + i);
//            try {
//                Thread.sleep(1000); // 1 second pause
//            } catch (InterruptedException e) {
//                System.out.println("MyThread interrupted");
//            }
//        }
//    }
//}
//
//class YourThread extends Thread {
//    public void run() {
//        for (int j = 1; j <= 3; j++) {
//            System.out.println("YourThread: " + j);
//            try {
//                Thread.sleep(1500); // 1.5 seconds pause
//            } catch (InterruptedException e) {
//                System.out.println("YourThread interrupted");
//            }
//        }
//    }
//}
//
//public class UsingSleep {
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        YourThread t2 = new YourThread();
//
//        t1.start(); // Start first thread
//        try {
//            Thread.sleep(500); // Delay second thread by 0.5 seconds
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted");
//        }
//        t2.start(); // Start second thread after short delay
//    }
//}


