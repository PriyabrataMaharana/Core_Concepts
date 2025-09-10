package pre_defined_FI;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee {
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class BiFunctionExample {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		BiFunction<Integer, String, Employee> bf = (id, name) -> new Employee(id, name);
		l.add(bf.apply(101, "Priyabrata"));
		l.add(bf.apply(102, "Soumya"));
		l.add(bf.apply(103, "Mittal"));
		l.add(bf.apply(104, "Sekhar"));
		l.add(bf.apply(105, "Mohini"));
		for(Employee e : l) {
			System.out.println("Employee id: "+e.id);
			System.out.println("Employee name: "+e.name);
			System.out.println();
		}
	}
}
