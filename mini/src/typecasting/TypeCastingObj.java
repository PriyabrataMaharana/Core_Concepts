package typecasting;


class Parent {
	String name = "John";
	
	void m1() {
		System.out.println("from parent..");
	}
}

class Child extends Parent {
	int id = 101;
	void m2() {
		System.out.println("From child..");
	}
}

public class TypeCastingObj {

	public static void main(String[] args) {
		/*
		 * Parent p = new Parent(); if (p instanceof Child) { // Check if p is an
		 * instance of Child Child c= (Child) p; // Safe down casting
		 * System.out.println(c.name); c.m1(); System.out.println(c.id); c.m2(); } else
		 * { System.out.println("Cannot safely downcast Parent to Child."); }
		 */
		Parent p = new Child();
		Child c = (Child) p;
		System.out.println(c.name);
		System.out.println(c.id);
		
		c.m1(); c.m2();
	}

}
