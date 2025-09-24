package optional_class;

import java.util.Optional;

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
public class BeforeOptional {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Soumya");
		System.out.println(s1.getName());
		Student s2 = new Student(102, null);
		String name = s2.getName();
		name.toUpperCase();	// Null Pointer Exception
		
	}
}
