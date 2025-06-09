package cloning.concept;


public class SimpleCloningExample implements Cloneable {
	int a = 10;
	int b = 20;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		SimpleCloningExample s1 = new SimpleCloningExample();
		SimpleCloningExample s2 = (SimpleCloningExample)s1.clone();
		s2.a = 888;
		s2.b = 999;
		System.out.println(s1.a+"..."+s1.b);	// 10...20
		System.out.println(s2.a+"..."+s2.b);	// 888...999
	}
}
