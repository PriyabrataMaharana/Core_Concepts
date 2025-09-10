package constructor_reference;

class Sample {
	// Constructor
	Sample() {
		System.out.println("Sample Class Constructor Execution...");
	}
}

interface Interf {
	public Sample get();
}

public class Test {
	public static void main(String[] args) {
		Interf i = Sample::new;
		Sample s1 = i.get();
		Sample s2 = i.get();
		Sample s3 = i.get();
		Sample s4 = i.get();
	}
}
