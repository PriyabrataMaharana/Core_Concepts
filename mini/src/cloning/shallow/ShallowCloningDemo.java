package cloning.shallow;


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
	
	public Object myClone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c = new Cat(20);
		Dog d1 = new Dog(10, c);
		System.out.println("Before Cloning: d1 --> "+d1.i+"..."+d1.c.j);
		Dog d2 = (Dog) d1.myClone();
		d2.i = 888;
		d2.c.j = 999;
		System.out.println("After Cloning: d1 --> "+d1.i+"..."+d1.c.j);
		System.out.println("After Cloning: d2 --> "+d2.i+"..."+d2.c.j);
	}
}
