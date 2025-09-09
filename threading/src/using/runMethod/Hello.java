package using.runMethod;

class MyThread extends Thread 
{
  	// Overriding the run method
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
      	// Creating thread
        MyThread t = new MyThread();
        t.run();
    }
}
