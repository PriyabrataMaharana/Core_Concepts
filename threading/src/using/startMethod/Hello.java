package using.startMethod;

class MyThread extends Thread 
{
  	// Overridng the run method
  	@Override
    public void run()
    {
        System.out.println("Current thread name: "
                           + Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}

// Driver class
public class Hello 
{
    public static void main(String[] args)
    {
      	// Creating new thread
        MyThread t = new MyThread();
        t.start();
    }
}
