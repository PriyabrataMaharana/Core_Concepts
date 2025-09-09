package cloning.deep;


class Cat{
	int j;
	
	Cat(int j){
		this.j = j;
	}
}

class Dog implements Cloneable {
	int i;
	Cat c;
	
	Dog(int i, Cat c){
		this.i = i;
		this.c = c;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Cat c1 = new Cat(c.j);
		Dog d = new Dog(i, c1);
		return d;
	}
}
public class DeepCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d1 = new Dog(10, c);
		System.out.println("Before Cloning: d1 --> "+d1.i+"..."+d1.c.j);
		Dog d2 = (Dog) d1.clone();
		d2.i = 888;
		d2.c.j = 999;
		System.out.println("After Cloning: d1 --> "+d1.i+"..."+d1.c.j);
		System.out.println("After Cloning: d2 --> "+d2.i+"..."+d2.c.j);
	}
}
