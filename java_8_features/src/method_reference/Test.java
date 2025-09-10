package method_reference;


public class Test {
	public void m1() {
		for(int i = 0; i < 6; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		Runnable r = test::m1;
		// Runnable r = Test::m1; [if m1() is static then directly you can call with Test]
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i < 6; i++) {
			System.out.println("Main Thread");
		}
	}
}
