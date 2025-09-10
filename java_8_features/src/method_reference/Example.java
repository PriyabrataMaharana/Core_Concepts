package method_reference;

interface Interf {
	public void add(int a, int b);
}

public class Example {
	public static void sum(int x, int y) {
		System.out.println("Sum is: "+(x+y));
	}
	
	public static void main(String[] args) {
		Interf i = (a,b) -> System.out.println("Sum is: "+(a+b));
		i.add(10, 20);
		
		Interf i1 = Example::sum;
		i1.add(100, 200);
	}
}
