package optional_class;

import java.util.Optional;

class Person {
	int id;
	String name;
	public Person(int id, String name) {
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
}

public class UsingOptionalClass {
	public static void main(String[] args) {
		Person p1 = new Person(101, "Soumya");
		System.out.println(p1.getName());
		Person p2 = new Person(102, "PATNAIK");
		Optional<String> nameOptional = Optional.ofNullable(p2.getName());
//		if(nameOptional.isPresent()) {
//			System.out.println(nameOptional);
//		}
//		System.out.println(nameOptional.orElse("Value is null"));
//		System.out.println(nameOptional.orElseThrow(
//				() -> new IllegalArgumentException("Enter a valid name"))
//			);
		System.out.println(nameOptional.map(String::toLowerCase)
				.orElseGet(() -> "Default Name"));
	}
}
