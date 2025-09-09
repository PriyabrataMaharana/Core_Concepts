package pre_defined_FI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
public class ApplyOnStudent {
	public static void main(String[] args) {
		// Common code: as we need the student objects to operate
		Student [] stu = {
				(new Student("Priyabrata", 100)),
				(new Student("Ansuman", 95)),
				(new Student("Dinesh", 65)),
				(new Student("Subham", 59)),
				(new Student("Ajay", 43)),
				(new Student("Rahul", 22))
		};
		
		// Application of Function on Student object
		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if(marks >= 80) return "A [Distinction]";
			else if(marks >= 60) return "B [First Class]";
			else if(marks >= 50) return "C [Second Class]";
			else if(marks >= 35) return "D [Third Class]";
			else grade = "E [Failed]";
			return grade;
		};
		
		// Application of Predicate on Student object
		Predicate<Student> p = s -> s.marks >=60;
		
		// Obtain the result based on Predicate and Function
		for(Student s1: stu) {
			if(p.test(s1)) {
				System.out.println("Student name: "+s1.name);
				System.out.println("Student mark: "+s1.marks);
				System.out.println("Student grade: "+f.apply(s1));
				System.out.println();
			}
		}
		
		// Consumer Specific
		Consumer<Student> c = s1 -> {
			System.out.println("Student name: "+s1.name);
			System.out.println("Student mark: "+s1.marks);
			System.out.println("Student grade: "+f.apply(s1));
			System.out.println();
		};
		
		// Obtain the result based on Consumer
		for(Student s1 : stu) {
			c.accept(s1);
		}
	}
}