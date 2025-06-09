package recursive_method_call;

public class Example {

	static void m1() {
		System.out.println("Hello");
		m1();	// Recursive Call
	}
	
	public static void main(String[] args) {
		m1();
	}
}
