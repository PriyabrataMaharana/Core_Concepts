package thread.synchronization;

//Shared printer class (shared resource)
class Printer {
	// Synchronized method ensures only one thread uses it at a time
	public synchronized void printDocument(String threadName) {
		System.out.println(threadName + " started printing...");
		// Simulate time taken to print ---> If you want
//		try {
//			Thread.sleep(1000); // 1 second
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(threadName + " finished printing.");
	}
}
//Thread class that represents an employee trying to use the printer
class Employee extends Thread {
	Printer printer; // shared resource

	Employee(Printer printer, String name) {
		super(name); // set thread name
		this.printer = printer;
	}

	public void run() {
		printer.printDocument(Thread.currentThread().getName());
	}
}
//Main class
public class SynchronizePrinterExample {
	public static void main(String[] args) {
		Printer sharedPrinter = new Printer(); // One shared printer

		// Creating multiple employees (threads)
		Employee emp1 = new Employee(sharedPrinter, "Employee-1");
		Employee emp2 = new Employee(sharedPrinter, "Employee-2");
		Employee emp3 = new Employee(sharedPrinter, "Employee-3");

		// Start threads
		emp1.start();
		emp2.start();
		emp3.start();
	}
}
