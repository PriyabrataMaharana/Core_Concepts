package constructor_reference;

class Sample1 {
	// Constructor
	Sample1(String s) {
		System.out.println("Sample Class Constructor Execution with argument..."+s);
	}
}

interface Interf1 {
	public Sample1 get(String s);
}

public class Test1 {
	public static void main(String[] args) {
		Interf1 i = Sample1::new;
		Sample1 s1 = i.get("Priyabrata");
		Sample1 s2 = i.get("soumya");
	}
}
