package pre_defined_FI;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Intern {
	String name;
	double salary;
	
	Intern(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class BiConsumerExample {
	public static void main(String[] args) {
		ArrayList<Intern> l = new ArrayList<Intern>();
		populate(l);
		BiConsumer<Intern, Double> bc = (e, d) -> e.salary = e.salary+d;
		for(Intern i : l) {
			bc.accept(i, 5000.0);
		}
		
		for(Intern i : l) {
			System.out.println("Intern name: "+i.name);
			System.out.println("Intern salary: "+i.salary);
			System.out.println();
		}
	}
	
	public static void populate(ArrayList<Intern> l) {
		l.add(new Intern("Priyabrata", 10000));
		l.add(new Intern("Soumya", 20000));
		l.add(new Intern("Mittal", 15000));
		l.add(new Intern("Sekhar", 8000));
		l.add(new Intern("Mohini", 14000));
	}
}
